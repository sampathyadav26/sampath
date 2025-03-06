package com.example.multipledatabase.db2config;

import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.example.multipledatabase.db2repo",
        entityManagerFactoryRef = "userEntitymanagerFactory", // Updated to match bean name
        transactionManagerRef = "secondaryTransactionManager")

public class Db2Config {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.secondary")
    public DataSourceProperties dataSourcePropertiesSecondary(){
        return new DataSourceProperties();
    }


    @Bean(name = "userDataSource")
    public DataSource dataSource(){
        return dataSourcePropertiesSecondary().initializeDataSourceBuilder().build();
    }

    @Bean(name = "userEntitymanagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder,
                                                                           @Qualifier("userDataSource") DataSource dataSource){
        Map<String,String> properties=new HashMap<>();
        properties.put("hibernate.ddl-auto","update");
         return entityManagerFactoryBuilder.dataSource(dataSource)
                 .packages("com.example.multipledatabase.db2entity")
                 .persistenceUnit("user")
                 .build();
    }

//    @Bean
//    public EntityManagerFactoryBuilder entityManagerFactoryBuilder() {
//        Map<String, Object> jpaProperties = new HashMap<>();
//        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
//        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
//        return new EntityManagerFactoryBuilder(new HibernateJpaVendorAdapter(), jpaProperties, null);
//    }
    @Bean(name = "secondaryTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("userEntitymanagerFactory") EntityManagerFactory entityManagerFactory){
         return new JpaTransactionManager(entityManagerFactory);
    }
}

package com.example.multipledatabase.db1config;

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
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
        basePackages = "com.example.multipledatabase.db1repo",
        entityManagerFactoryRef = "bookEntityManagerFactory",
        transactionManagerRef = "bookTransactionManager")
public class Db1Config {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.primary")
    public DataSourceProperties dataSourceProperties(){
        return new DataSourceProperties();
    }
    @Primary
    @Bean(name = "bookdatasource")
    public DataSource dataSource(){
//        return new DataSourceProperties();
        return dataSourceProperties().initializeDataSourceBuilder()
                .build();
    }


    @Primary
    @Bean(name = "bookEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("bookdatasource") DataSource dataSource) {

        Map<String,String> properties=new HashMap<>();
        properties.put("hibernate.hbm2ddl-auto","update");
        properties.put("hibernate.dialect","org.hibernate.dialect.MySQL8Dialect");
        return builder
                .dataSource(dataSource)
                .packages("com.example.multipledatabase.entity")
                .persistenceUnit("book")
                .build();
    }
    @Bean
    public EntityManagerFactoryBuilder entityManagerFactoryBuilder() {
        Map<String, Object> jpaProperties = new HashMap<>();
        jpaProperties.put("hibernate.hbm2ddl.auto", "update");
        jpaProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQL8Dialect");
        return new EntityManagerFactoryBuilder(new HibernateJpaVendorAdapter(), jpaProperties, null);
    }

    @Primary
    @Bean(name = "bookTransactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("bookEntityManagerFactory") EntityManagerFactory entityManagerFactory){
        return  new JpaTransactionManager(entityManagerFactory);
    }
}

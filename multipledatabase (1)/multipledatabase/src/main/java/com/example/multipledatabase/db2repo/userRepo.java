package com.example.multipledatabase.db2repo;

import com.example.multipledatabase.db2entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<Users,Integer> {
}

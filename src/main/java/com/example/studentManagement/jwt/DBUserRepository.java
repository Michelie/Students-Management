package com.example.studentManagement.jwt;

import com.example.studentManagement.jwt.DBUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DBUserRepository extends CrudRepository<DBUser,Long> {
    Optional<DBUser> findByName(String name);
}

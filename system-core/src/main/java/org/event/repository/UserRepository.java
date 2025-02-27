package com.example.systemcore.repository;

import com.example.systemcore.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByUsername(String userName);
    User findFirstByUsername(String username);
}

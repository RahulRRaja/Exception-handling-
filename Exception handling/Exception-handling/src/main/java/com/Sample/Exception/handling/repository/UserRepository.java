package com.Sample.Exception.handling.repository;

import com.Sample.Exception.handling.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Long> {
}

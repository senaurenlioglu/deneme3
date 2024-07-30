package com.deneme2.deneme2.repository;

import com.deneme2.deneme2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

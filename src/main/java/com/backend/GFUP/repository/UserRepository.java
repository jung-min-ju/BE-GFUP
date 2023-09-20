package com.backend.GFUP.repository;

import com.backend.GFUP.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}

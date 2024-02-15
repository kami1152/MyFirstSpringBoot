package com.example.starspring.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.starspring.user.SiteUser;
import java.util.List;

public interface UserRepository extends JpaRepository<SiteUser, Long> {

    Optional<SiteUser> findByUsername(String username);
}

package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.jpa.model.UserProfile;

@Transactional
@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long> {

}

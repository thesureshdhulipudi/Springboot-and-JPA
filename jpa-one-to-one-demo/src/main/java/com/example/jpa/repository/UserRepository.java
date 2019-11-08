package com.example.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.jpa.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	void deleteByFirstName(String string);

}

package com.education.college.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.college.domain.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long> {

}

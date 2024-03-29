package com.education.school.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.education.school.domain.School;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

}

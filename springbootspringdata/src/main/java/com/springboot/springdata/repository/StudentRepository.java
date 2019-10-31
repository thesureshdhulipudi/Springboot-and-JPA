package com.springboot.springdata.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.springboot.springdata.entity.Student;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, Integer>{

	Student findAllById(Integer rollNum);

}

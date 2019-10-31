package com.springboot.springdata.service;

import java.util.List;

import com.springboot.springdata.entity.Student;

public interface StudentService {

	List<Student> getAllStudents();

	Student getStudentByRollNum(Integer rollNum);

	List<Student> saveStudent(Student stu);

	Student updateStudent(Student stu);

	List<Student> deleteStudent(Integer rollNum);

}

package com.springboot.springdata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.springdata.entity.Student;
import com.springboot.springdata.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	@Override
	public Student getStudentByRollNum(Integer rollNum) {
		return studentRepository.findAllById(rollNum);
	}

	@Override
	public List<Student> saveStudent(Student stu) {
		studentRepository.save(stu);
		return getAllStudents();
	}

	@Override
	public Student updateStudent(Student stu) {
		studentRepository.save(stu);
		return getStudentByRollNum(stu.getId());
	}

	@Override
	public List<Student> deleteStudent(Integer rollNum) {
		studentRepository.deleteById(rollNum);
		return getAllStudents();
	}

}

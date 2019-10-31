package com.springboot.springdata.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.springdata.entity.Student;
import com.springboot.springdata.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;

	@GetMapping("/getAll")
	public List<Student> getAllStudent(){
		return studentService.getAllStudents();
	}
	
	@GetMapping("/getByRollNum/{rollNum}")
	public Student getStudentById(@PathVariable Integer rollNum) {
		return studentService.getStudentByRollNum(rollNum);
	}
	
	@PostMapping("/save")
	public List<Student> saveStudent(@RequestBody Student stu){
		return studentService.saveStudent(stu);
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student stu) {
		return studentService.updateStudent(stu);
	}
	
	@DeleteMapping("/delete")
	public List<Student> deleteStudent(@PathParam (value="rollNum") Integer rollNum){
		return studentService.deleteStudent(rollNum);
	}
}

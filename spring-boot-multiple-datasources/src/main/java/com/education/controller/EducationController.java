package com.education.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.education.college.repo.CollegeRepository;
import com.education.school.repo.SchoolRepository;

@RestController
public class EducationController {

	@Autowired
	private SchoolRepository schoolRepo;
	@Autowired
	private CollegeRepository collegeRepo;

	@RequestMapping("/getAllSchoolsAndColleges")
	public Map<String, Object> getAllSchoolsAndColleges() {
		Map<String, Object> education = new HashMap<>();
		education.put("school_list", schoolRepo.findAll());
		education.put("college_list", collegeRepo.findAll());

		return education;
	}

}

package com.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.management.dto.StudentManagementDTO;
import com.management.entity.StudentManagement;
import com.management.service.StudentManagementService;

@RestController
@RequestMapping("/student-management")
public class StudentManagementController {

	@Autowired
	private StudentManagementService studentManagementService;
	
	@PostMapping("/save")
	public StudentManagement saveStudentManagement(@RequestBody StudentManagement studentManagement) {
		return studentManagementService.saveStudentManagement(studentManagement);
	}
	
	@GetMapping("/findAllStudentManagement")
	public List<StudentManagementDTO> findAllStudentManagement(){
		return studentManagementService.findAllStudentManagement();
	}
}

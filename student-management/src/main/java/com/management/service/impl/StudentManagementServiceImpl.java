package com.management.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.entity.StudentManagement;
import com.management.repo.StudentManagementRepo;
import com.management.service.StudentManagementService;

@Service
public class StudentManagementServiceImpl implements StudentManagementService {

	@Autowired
	private StudentManagementRepo studentManagementRepo;
	
	@Override
	public StudentManagement saveStudentManagement(StudentManagement studentManagement) {
		return studentManagementRepo.save(studentManagement);
	}

}

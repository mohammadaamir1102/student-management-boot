package com.management.service;

import java.util.List;

import com.management.dto.StudentManagementDTO;
import com.management.entity.StudentManagement;

public interface StudentManagementService {

	StudentManagement saveStudentManagement(StudentManagement studentManagement);
	List<StudentManagementDTO> findAllStudentManagement();
}

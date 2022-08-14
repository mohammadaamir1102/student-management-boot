package com.management.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.management.dto.StudentManagementDTO;
import com.management.entity.StudentManagement;
import com.management.repo.StudentManagementRepo;
import com.management.service.StudentManagementService;

@Service
public class StudentManagementServiceImpl implements StudentManagementService {

	@Autowired
	private StudentManagementRepo studentManagementRepo;

	@Autowired
	private Mapper dozzerMapper;

	@Override
	public StudentManagement saveStudentManagement(StudentManagement studentManagement) {
		return studentManagementRepo.save(studentManagement);
	}

	@Override
	public List<StudentManagementDTO> findAllStudentManagement() {
		List<StudentManagement> studentManagements = studentManagementRepo.findAll();
		//if LocalDate in our Entity then we got ERROR because LocalDate is not supported by Dozzer
		return studentManagements.stream()
				.map(value -> dozzerMapper.map(value, StudentManagementDTO.class))
				.collect(Collectors.toList());
	}

}

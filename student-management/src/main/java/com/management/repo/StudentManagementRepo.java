package com.management.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.entity.StudentManagement;

@Repository
public interface StudentManagementRepo extends JpaRepository<StudentManagement, Long> {

}

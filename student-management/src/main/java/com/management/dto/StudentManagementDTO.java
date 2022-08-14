package com.management.dto;

import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class StudentManagementDTO {

	private Long studentId;
	private String studentFirstName;
	private String studentLastName;
	private String studentPhoneNumber;
	private String studentGender;
	private Date studentDOB;
	private Double studentSalary;
	private String studentCityName;
	private Boolean isActive;
	private String studentPinCode;
	private String studentSatate;
	private String studentDistrict;
	private String studentCollegeName;
	private String studentCourse;
	private Timestamp createdOn;
	private Timestamp updatedOn;

}

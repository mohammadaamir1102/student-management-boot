package com.management.entity;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class StudentManagement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long studentId;
	
	private String studentFirstName;
	private String studentLastName;
	private String studentPhoneNumber;
	private String studentGender;
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate studentDOB;
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
	
	private StudentManagement() {
		super();
		this.createdOn=Timestamp.valueOf(LocalDateTime.now());
		this.updatedOn=Timestamp.valueOf(LocalDateTime.now());
	}

	private StudentManagement(Long studentId, String studentFirstName, String studentLastName,
			String studentPhoneNumber, String studentGender, LocalDate studentDOB, Double studentSalary,
			String studentCityName, Boolean isActive, String studentPinCode, String studentSatate,
			String studentDistrict, String studentCollegeName, String studentCourse, Timestamp createdOn,
			Timestamp updatedOn) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentPhoneNumber = studentPhoneNumber;
		this.studentGender = studentGender;
		this.studentDOB = studentDOB;
		this.studentSalary = studentSalary;
		this.studentCityName = studentCityName;
		this.isActive = isActive;
		this.studentPinCode = studentPinCode;
		this.studentSatate = studentSatate;
		this.studentDistrict = studentDistrict;
		this.studentCollegeName = studentCollegeName;
		this.studentCourse = studentCourse;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentPhoneNumber() {
		return studentPhoneNumber;
	}

	public void setStudentPhoneNumber(String studentPhoneNumber) {
		this.studentPhoneNumber = studentPhoneNumber;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public LocalDate getStudentDOB() {
		return studentDOB;
	}

	public void setStudentDOB(LocalDate studentDOB) {
		this.studentDOB = studentDOB;
	}

	public Double getStudentSalary() {
		return studentSalary;
	}

	public void setStudentSalary(Double studentSalary) {
		this.studentSalary = studentSalary;
	}

	public String getStudentCityName() {
		return studentCityName;
	}

	public void setStudentCityName(String studentCityName) {
		this.studentCityName = studentCityName;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getStudentPinCode() {
		return studentPinCode;
	}

	public void setStudentPinCode(String studentPinCode) {
		this.studentPinCode = studentPinCode;
	}

	public String getStudentSatate() {
		return studentSatate;
	}

	public void setStudentSatate(String studentSatate) {
		this.studentSatate = studentSatate;
	}

	public String getStudentDistrict() {
		return studentDistrict;
	}

	public void setStudentDistrict(String studentDistrict) {
		this.studentDistrict = studentDistrict;
	}

	public String getStudentCollegeName() {
		return studentCollegeName;
	}

	public void setStudentCollegeName(String studentCollegeName) {
		this.studentCollegeName = studentCollegeName;
	}

	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Timestamp getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Timestamp updatedOn) {
		this.updatedOn = updatedOn;
	}

	@Override
	public String toString() {
		return "StudentManagement [studentId=" + studentId + ", studentFirstName=" + studentFirstName
				+ ", studentLastName=" + studentLastName + ", studentPhoneNumber=" + studentPhoneNumber
				+ ", studentGender=" + studentGender + ", studentDOB=" + studentDOB + ", studentSalary=" + studentSalary
				+ ", studentCityName=" + studentCityName + ", isActive=" + isActive + ", studentPinCode="
				+ studentPinCode + ", studentSatate=" + studentSatate + ", studentDistrict=" + studentDistrict
				+ ", studentCollegeName=" + studentCollegeName + ", studentCourse=" + studentCourse + ", createdOn="
				+ createdOn + ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
	
	
}

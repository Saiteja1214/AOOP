package com.EmployeeManagement;

public class StaffMember {
	 private String fullName;
	 private String jobTitle;
	 private double salary;

	 // Constructor
	 public StaffMember(String fullName, String jobTitle, double salary) {
	     this.fullName = fullName;
	     this.jobTitle = jobTitle;
	     this.salary = salary;
	 }

	 // Getters
	 public String getFullName() {
	     return fullName;
	 }

	 public String getJobTitle() {
	     return jobTitle;
	 }

	 public double getSalary() {
	     return salary;
	 }
}

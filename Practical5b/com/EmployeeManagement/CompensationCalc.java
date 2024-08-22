package com.EmployeeManagement;

public class CompensationCalc {
	 public double computeSalary(StaffMember staffMember) {
	        double salary = staffMember.getSalary();
	        double extraCompensation = determineBonus(staffMember.getJobTitle());
	        return salary + extraCompensation;
	    }
	    
	    private double determineBonus(String jobTitle) {
	        if ("Manager".equals(jobTitle)) {
	            return 2000;
	        } else if ("Developer".equals(jobTitle)) {
	            return 1500;
	        } else if ("Tester".equals(jobTitle)) {
	            return 1000;
	        } else {
	            return 500;
	        }
	    }
}

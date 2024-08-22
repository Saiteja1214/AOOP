package com.EmployeeManagement;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 StaffMember staff = new StaffMember("Teja", "Developer", 80000);

	       
	        CompensationCalc calculator = new CompensationCalc();

	        
	        double totalCompensation = calculator.computeSalary(staff);
	        System.out.println("Staff Member: " + staff.getFullName());
	        System.out.println("Total Compensation: " + totalCompensation);
	    }
	}



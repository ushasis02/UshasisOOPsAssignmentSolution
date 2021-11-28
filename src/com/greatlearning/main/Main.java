package com.greatlearning.main;
import com.greatlearning.model.*;

public class Main {

	public static void main(String[] args) {
		AdminDepartment admindepartment = new AdminDepartment();
			System.out.println("\n Welcome to "+admindepartment.departmentName());
			System.out.println(admindepartment.getTodaysWork());
			System.out.println(admindepartment.getWorkDeadline());
			System.out.println(admindepartment.isTodayAHoliday());
	
		HrDepartment hrdepartment = new HrDepartment();
			System.out.println("\n Welcome to "+hrdepartment.departmentName());
			System.out.println(hrdepartment.doActivity());
			System.out.println(hrdepartment.getTodaysWork());
			System.out.println(hrdepartment.getWorkDeadline());
			System.out.println(hrdepartment.isTodayAHoliday());
		
		TechDepartment techdepartment = new TechDepartment();
			System.out.println("\n Welcome to "+techdepartment.departmentName());
			System.out.println(techdepartment.getTodaysWork());
			System.out.println(techdepartment.getWorkDeadline());
			System.out.println(techdepartment.getTechStackInformation());
			System.out.println(techdepartment.isTodayAHoliday());
		
		}

}

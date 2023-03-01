package com.masai.output;

import java.util.Scanner;


import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class GetEmployeeAddress {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter empId...");
		int empId = sc.nextInt();
		
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		
		System.out.println(eDao.getAddressOfEmployee(empId));

	}

}

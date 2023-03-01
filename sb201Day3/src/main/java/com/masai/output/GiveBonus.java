package com.masai.output;

import java.util.Scanner;

import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class GiveBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter enpId....");
		int id = sc.nextInt();
		
		System.out.println("enter bonus amount..");
		int bonus = sc.nextInt();
		
		EmployeeDao eDao = new EmployeeDaoImpl();
		String msg =eDao.giveBonusToEmployee(id, bonus);
		System.out.println(msg);
		
	}

}

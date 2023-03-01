package com.masai.output;

import com.masai.Employee;
import com.masai.Dao.EmployeeDao;
import com.masai.Dao.EmployeeDaoImpl;

public class SaveEmployee {

	public static void main(String[] args) {
		
		Employee emp = new Employee(30, "emp3","addr3",7000);
		
		EmployeeDao edao = new EmployeeDaoImpl();
		edao.save(emp);
	

	}

}

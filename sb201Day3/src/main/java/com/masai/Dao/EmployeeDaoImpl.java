package com.masai.Dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	

	@Override
	public void save(Employee emp) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeUnit");
		
	    EntityManager em =	emf.createEntityManager();
	    
	    em.getTransaction().begin();
	    em.persist(emp);
	    em.getTransaction().commit();
	    System.out.println("employee inserted successfully....");
	    
	    em.close();
		
	}

	@Override
	public String getAddressOfEmployee(int empId) {
		String msg = null;
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em =	emf.createEntityManager();
	    
	   Employee emp = em.find(Employee.class,empId);
	   
	   if(emp != null) {
		   msg = emp.getAddress();
	   }else {
		   msg = "employee not found with this id...";
	   }
	   em.close();
		
		return msg;
	}

	@Override
	public String giveBonusToEmployee(int empId, int bonus) {
		String msg = null;
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em =	emf.createEntityManager();
	    Employee emp = em.find(Employee.class,empId);
	    
	   
	  
	   if(emp != null) {
		   em.getTransaction().begin();
		   emp.setSalary(emp.getSalary()+bonus);
		   msg = "updated..";
		   em.getTransaction().commit();
		 
	   }
	   else {
		   msg = "employee not found with this id...";
	   }
	   em.close();
	    
	   
		
		return msg;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		boolean b = false;
		EntityManagerFactory emf =  Persistence.createEntityManagerFactory("employeeUnit");
	    EntityManager em =	emf.createEntityManager();
	    Employee emp = em.find(Employee.class,empId);
	    
	    if(emp != null) {
	    	
	    	em.getTransaction().begin();
	    	em.remove(emp);
	    	b = true;
	    	em.getTransaction().commit();
	    }else {
	    	System.out.println("Employee not removed with this id..");
	    }
		
		return b;
	}

}

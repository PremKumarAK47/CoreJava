package com.practiceQuestion2;

public class Main {
    public static void main(String[] args) {
    	//Accessing by private Constructor
        //Loan loan = Loan.createLoan();

        PermanentEmployee permanentEmployee = new PermanentEmployee(1, "Name1", 1000);
        permanentEmployee.calculateSalary();
        double permanentEmployeeLoan = Loan.calculateLoanAmount(permanentEmployee);

        TemporaryEmployee temporaryEmployee = new TemporaryEmployee(2, "Name2", 20, 100);
        temporaryEmployee.calculateSalary();
        double temporaryEmployeeLoan = Loan.calculateLoanAmount(temporaryEmployee);

        System.out.println("Loan Amount for Permanent Employee => " + permanentEmployeeLoan);
        System.out.println("Loan Amount for Temporary Employee => " + temporaryEmployeeLoan);
    }
}



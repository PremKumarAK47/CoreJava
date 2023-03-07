package com.practiceQuestion2;

public class Loan {
    private Loan() {}

    public static Loan createLoan()
    {
    	return new Loan();
    }
    public static double calculateLoanAmount(Employee employeeObj) {
        double loanAmount = 0;
        if (employeeObj instanceof PermanentEmployee) {
            loanAmount = 0.15 * employeeObj.getSalary();
        } else if (employeeObj instanceof TemporaryEmployee) {
            loanAmount = 0.10 * employeeObj.getSalary();
        }
        return loanAmount;
    }
}

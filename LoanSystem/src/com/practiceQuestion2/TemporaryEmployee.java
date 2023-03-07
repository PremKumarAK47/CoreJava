package com.practiceQuestion2;

public class TemporaryEmployee extends Employee {
    private Integer hoursWorked;
    private Integer hourlyWages;

    public TemporaryEmployee(Integer employeeId, String employeeName, Integer hoursWorked, Integer hourlyWages) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }

    public Integer getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Integer hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Integer getHourlyWages() {
        return hourlyWages;
    }

    public void setHourlyWages(Integer hourlyWages) {
        this.hourlyWages = hourlyWages;
    }

    @Override
    public void calculateSalary() {
        salary = hoursWorked * hourlyWages;
    }
}


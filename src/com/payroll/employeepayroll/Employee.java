package com.payroll.employeepayroll;

public class Employee {
    private String name;
    double rateOfPay;
    int hoursWorked;

    //Create methods that will get the employee name
    public String getName() {
        return name;
    }

    public String setName(String employeeName) {
        this.name = employeeName;
        return employeeName;
    }

    public double getRateOfPay() {
        return rateOfPay;
    }

    public double setRateOfPay(double rate) {
        this.rateOfPay = rate;
        return rate;
    }

    public int setHoursWorked(int hours) {
        this.hoursWorked = hours;
        return hours;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}

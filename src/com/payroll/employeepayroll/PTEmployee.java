package com.payroll.employeepayroll;

public class PTEmployee extends Employee {
    double grossPay;
    double deduction;
    double fedTax, stateTax, medTax, socialSecurityTax, unempInsTax;
    double netPay;

    public double setGrossPay(double hours, double rate) {
        this.grossPay = (hours * rate);
        return grossPay;
    }
    public double getGrossPay() {
        return grossPay;
    }

    public float getDeduction() {
        fedTax = .15 * this.grossPay;
        stateTax = .0307 * this.grossPay;
        medTax = .0145 * this.grossPay;
        socialSecurityTax = .062 * this.grossPay;
        unempInsTax = .0007 * this.grossPay;
        this.deduction = fedTax + stateTax + medTax + socialSecurityTax + unempInsTax;
        return (float) deduction;
    }


    public double getNetPay() {
        this.netPay = grossPay - deduction;
        return netPay;
    }


}

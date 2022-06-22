/*
  Name of program: Employee Payroll
  Author/student’s name: Jada Alexander
  Course name and number: CPT 307 Data Structures & Algorithms
  Instructor’s name: Joshua Reichard
  Date submitted: 06/21/2022
 */

package com.payroll.employeepayroll;
import java.util.Scanner;


public class EmployeePayroll extends Employee {
//We need employee type here to determine if FT or PT
    public static void main(String[] args) {
        Scanner employee = new Scanner(System.in);

        System.out.println("Please enter name, rate of pay, and hours worked of employee.");

        //Add objects below here
        Employee empInfo = new Employee();

        System.out.print("Name: ");
        String name = empInfo.setName(employee.nextLine());

        System.out.print("Rate of pay: ");
        double rate = empInfo.setRateOfPay(employee.nextDouble());

        System.out.print("Hours worked: ");
        int hours = empInfo.setHoursWorked(employee.nextInt());
        System.out.println();
        System.out.println();


        System.out.println("Name: " + empInfo.getName());
        System.out.println("Rate of pay: " + empInfo.getRateOfPay());
        System.out.println();
        System.out.println();


        System.out.println("Is " + name + " a full-time or part-time employee?");
        System.out.print("Please enter FT or PT: ");
        String employeeType = employee.next();

        if (employeeType.equalsIgnoreCase("FT")) {
            //If they are a full-time employee, grab the calculation from the FTEmployee class to print the calculation.
            FTEmployee ftEmp = new FTEmployee();
            ftEmp.setGrossPay(hours, rate);
            ftEmp.setOvertime(hours,rate);

            if (hours > 40) {

                System.out.println("Overtime Worked: " + hours);
                System.out.println("Gross Pay: " + ftEmp.getOvertime());
                System.out.println("Total deduction: " + ftEmp.getDeduction());
                System.out.println("Net Pay: " + ftEmp.getNetPay());
            } else if(hours > 25 && hours <= 40) {
                System.out.println("Hours Worked: " + hours);
                System.out.println("Gross Pay: " + ftEmp.getGrossPay());
                System.out.println("Total deduction: " + ftEmp.getDeduction());
                System.out.println("Net Pay: " + ftEmp.getNetPay());
            } else {
                System.out.println("This employee should be part-time since they work under 25 hours.");
            }

        } else if (employeeType.equalsIgnoreCase("PT")) {
            PTEmployee ptEmp = new PTEmployee();
            ptEmp.setGrossPay(hours, rate);

            //If they are a part-time employee, grab the calculation from the PTEmployee class to print the calculation.
            if (hours > 0 && hours <= 25) {
                System.out.println("Hours Worked: " + hours);
                System.out.println("Gross Pay: " + ptEmp.getGrossPay());
                System.out.println("Total deduction: " + ptEmp.getDeduction());
                System.out.println("Net Pay: " + ptEmp.getNetPay());
            }else {
                System.out.println("Please try again.");
            }
        }

    }
}

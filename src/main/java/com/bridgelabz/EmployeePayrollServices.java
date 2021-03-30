package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollServices {

    public enum IOServices {
        CONSOLE_ID, FILE_IO, REST_IO
    }

    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayrollServices() {}

    public EmployeePayrollServices(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    private void readEmployeePayrollData(Scanner consoleInputReader)
    {
        System.out.println("Enter Employee ID:");
        int id = consoleInputReader.nextInt();

        System.out.println("Enter Employee Name:");
        String name = consoleInputReader.next();

        System.out.println("Enter Employee Salary:");
        double salary = consoleInputReader.nextDouble();
        employeePayrollList.add(new EmployeePayrollData(id, name, salary));
    }

    private void writeEmployeePayrollData()
    {
        System.out.println("\n Writing Employee Payroll Roaster to Console \n" + employeePayrollList);
    }

    public static void main(String[] args) {
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
        EmployeePayrollServices employeePayrollServices = new EmployeePayrollServices(employeePayrollList);
        Scanner consoleInputReader = new Scanner(System.in);
        employeePayrollServices.readEmployeePayrollData(consoleInputReader);
        employeePayrollServices.writeEmployeePayrollData();
    }
}

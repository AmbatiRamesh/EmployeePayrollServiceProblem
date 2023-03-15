package com.javaIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeePayrollService {
    public  static List<CreateEmployeeDetails> empList = new ArrayList<>();
    public void readEmployeeData(Scanner scanner){
        System.out.println("Enter the id:");
        int id = scanner.nextInt();
        System.out.println("Enter the name:");
        String name = scanner.next();
        System.out.println("Enter the Salary:");
        double salary = scanner.nextInt();
        empList.add(new CreateEmployeeDetails(id,name,salary));
    }
    public void writeEmployeeData(){
        empList.forEach(System.out::println);
    }
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        EmployeePayrollService employeeObj= new EmployeePayrollService();
        employeeObj.readEmployeeData(scanner);
        employeeObj.writeEmployeeData();
    }
}
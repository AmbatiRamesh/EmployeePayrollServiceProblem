package com.javaIO;

public class CreateEmployeeDetails {
    int id;
    String name;
    double salary;
    public CreateEmployeeDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "CreateEmployeeDetails{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}


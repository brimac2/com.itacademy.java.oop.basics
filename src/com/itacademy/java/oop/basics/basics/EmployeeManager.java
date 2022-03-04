package com.itacademy.java.oop.basics.basics;

public class EmployeeManager {
    public static void main(String[] args) {
//        Created object with args
    Employee employeeSuzie = new Employee("Suzie", "Jack", Employee.ContractType.PARTTIME, "2022-03-01", 2020, "manager" );
//          Created object without args
    Employee employeeMartynas = new Employee();
    employeeMartynas.setName("Martynas");
    employeeMartynas.setSurname("Petruska");

    System.out.println(employeeSuzie.getEmployeeManager());
    System.out.println(employeeMartynas.getEmployeeManager());

    }
}

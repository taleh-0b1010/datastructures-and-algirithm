package com.java.datastructure.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(1, "Jane", "Jones"));
        employeeList.add(new Employee(2, "John", "Doe"));
        employeeList.add(new Employee(3, "Mary", "Smith"));
        employeeList.add(new Employee(4, "Mike", "Wilson"));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for (Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee(3, "Mary", "Smith")));
        System.out.println(employeeList.indexOf(new Employee(3, "Mary", "Smith")));

        employeeList.remove(new Employee(3, "Mary", "Smith"));
        employeeList.forEach(System.out::println);
    }
}

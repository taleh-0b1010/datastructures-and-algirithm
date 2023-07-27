package com.java.datastructure.challange;

import java.util.LinkedList;

public class LinkedListDuplicates {

    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Jane", "Jones"));
        employees.add(new Employee(2, "John", "Doe"));
        employees.add(new Employee(3, "Mike", "Wilson"));
        employees.add(new Employee(4, "Mary", "Smith"));
        employees.add(new Employee(2, "John", "Doe"));
        employees.add(new Employee(5, "Bill", "End"));
        employees.add(new Employee(1, "Jane", "Jones"));
    }
}

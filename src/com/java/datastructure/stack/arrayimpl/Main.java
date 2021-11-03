package com.java.datastructure.stack.arrayimpl;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(new Employee(1, "Jane", "Jones"));
        stack.push(new Employee(2, "John", "Doe"));
        stack.push(new Employee(3, "Mary", "Smith"));
        stack.push(new Employee(4, "Mike", "Wilson"));

        stack.printStack();
        System.out.println("---------------------------------------------------");
        System.out.println(stack.peek());
        System.out.println("---------------------------------------------------");
        System.out.println("Popped: " + stack.pop());
        Stack<Employee> employees = new Stack<>();

        employees.push(new Employee(1, "Jane", "Jones"));
        employees.push(new Employee(2, "John", "Doe"));
        employees.push(new Employee(3, "Mary", "Smith"));
        employees.push(new Employee(4, "Mike", "Wilson"));

        System.out.println(employees);
    }
}

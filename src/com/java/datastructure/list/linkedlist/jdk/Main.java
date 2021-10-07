package com.java.datastructure.list.linkedlist.jdk;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee(1, "Jane", "Jones");
        Employee johnDoe = new Employee(2, "John", "Doe");
        Employee marySmith = new Employee(3, "Mary", "Smith");
        Employee mikeWilson = new Employee(4, "Mike", "Wilson");
        Employee billEnd = new Employee(5, "Bill", "End");

        LinkedList<Employee> list = new LinkedList<>();
        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        System.out.println(list);

        list.addLast(billEnd);

        System.out.println(list);
    }
}

package com.java.datastructure.list.linkedlist.doubly;

class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee(1, "Jane", "Jones");
        Employee johnDoe = new Employee(2, "John", "Doe");
        Employee marySmith = new Employee(3, "Mary", "Smith");
        Employee mikeWilson = new Employee(4, "Mike", "Wilson");

        EmployeeLinkedList linkedList = new EmployeeLinkedList();
        linkedList.addToFront(janeJones);
        linkedList.addToFront(johnDoe);
        linkedList.addToFront(marySmith);
        linkedList.addToFront(mikeWilson);

        linkedList.printList();
        System.out.println(linkedList.getSize());

        linkedList.addToEnd(johnDoe);
        System.out.println(linkedList.getSize());
    }
}

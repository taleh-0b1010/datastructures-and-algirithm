package com.java.datastructure.list.linkedlist.doubly;

class EmployeeLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);

        if (head == null) {
            tail = node;
        } else {
            head.setPrevious(node);
        }

        head = node;
        size++;
    }

    void addToEnd(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setPrevious(tail);

        if (tail == null) {
            head = node;
        } else {
            tail.setNext(node);
        }

        tail = node;
        size++;
    }

    int getSize() {
        return size;
    }

    void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

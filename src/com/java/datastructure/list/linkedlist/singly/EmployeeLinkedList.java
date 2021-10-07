package com.java.datastructure.list.linkedlist.singly;

class EmployeeLinkedList {

    private EmployeeNode head;
    private int size;

    void addToFront(Employee employee) {
        EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        removedNode.setNext(null);
        return removedNode;
    }

    int getSize() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}

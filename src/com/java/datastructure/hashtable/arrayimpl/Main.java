package com.java.datastructure.hashtable.arrayimpl;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee(1, "Jane", "Jones");
        Employee johnDoe = new Employee(2, "John", "Doe");
        Employee marySmith = new Employee(3, "Mary", "Smith");
        Employee mikeWilson = new Employee(4, "Mike", "Wilson");

        SimpleHashTable hashTable = new SimpleHashTable();
        hashTable.put("Jane", janeJones);
        hashTable.put("John", johnDoe);
        hashTable.put("Mary", marySmith);
        hashTable.put("Mike", mikeWilson);

        hashTable.print();

        System.out.println("Retrieve key Wilson: " + hashTable.get("Mike"));
    }
}

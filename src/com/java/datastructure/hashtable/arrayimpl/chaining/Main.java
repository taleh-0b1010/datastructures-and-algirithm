package com.java.datastructure.hashtable.arrayimpl.chaining;

public class Main {

    public static void main(String[] args) {
        Employee janeJones = new Employee(1, "Jane", "Jones");
        Employee johnDoe = new Employee(2, "John", "Doe");
        Employee marySmith = new Employee(3, "Mary", "Smith");
        Employee mikeWilson = new Employee(4, "Mike", "Wilson");

        HashTable hashTable = new HashTable();
        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("Smith", marySmith);

        hashTable.print();
        System.out.println("------------------------------------------------");

        System.out.println("Retrieve key Smith: " + hashTable.get("Smith"));
        System.out.println("------------------------------------------------");

        hashTable.remove("Wilson");
        hashTable.remove("Jones");
        hashTable.print();
        System.out.println("------------------------------------------------");

        System.out.println("Retrieve key Smith: " + hashTable.get("Smith"));
    }
}

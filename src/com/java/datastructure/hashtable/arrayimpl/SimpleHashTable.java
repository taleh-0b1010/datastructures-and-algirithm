package com.java.datastructure.hashtable.arrayimpl;

public class SimpleHashTable {

    private final Employee[] hashtable;

    public SimpleHashTable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        System.out.println(hashedKey);
        if (hashtable[hashedKey] != null) {
            System.out.println("There is a value with the key: " + hashedKey);
        } else {
            hashtable[hashedKey] = employee;
        }
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void print() {
        for (Employee employee : hashtable) {
            System.out.println(employee);
        }
    }
}

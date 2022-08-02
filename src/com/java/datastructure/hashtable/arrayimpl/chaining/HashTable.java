package com.java.datastructure.hashtable.arrayimpl.chaining;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * General operations: <br/>
 *          put(),     O(1) <br/>
 *          remove(),  O(n) <br/>
 *          get()      O(n) <br/>
 */
public class HashTable {

    private LinkedList<StoredEmployee>[] hashtable;

    private int hashKey(String key) {
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode()) % hashtable.length;
    }

    public HashTable() {
        this.hashtable = new LinkedList[10];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<>();
        }
    }

    /**
     * Chaining.
     * In each position creating and linked list and saving objects into it
     * to get rid of collisions.
     */
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key, employee));
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            if (storedEmployee.key.equals(key)) {
                return storedEmployee.employee;
            }
        }
        return null;
    }

    public Employee remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredEmployee> iterator = hashtable[hashedKey].listIterator();
        StoredEmployee storedEmployee = null;
        int index = -1;
        while (iterator.hasNext()) {
            storedEmployee = iterator.next();
            index++;
            if (storedEmployee.key.equals(key)) {
                break;
            }
        }

        if (storedEmployee == null || !storedEmployee.key.equals(key)) {
            return null;
        } else {
            hashtable[hashedKey].remove(index);
            return storedEmployee.employee;
        }
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            } else {
                System.out.print("Position " + i + ": ");
                for (StoredEmployee storedEmployee : hashtable[i]) {
                    System.out.print(storedEmployee.employee);
                    System.out.print(" -> ");
                }
                System.out.println("null");
            }
        }
    }
}

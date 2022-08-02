package com.java.datastructure.hashtable.arrayimpl.linearprobing;

/**
 * General operations: <br/>
 *          put(),     O(n)   <br/>
 *          remove(),  O(n^2) <br/>
 *          get()      O(n)   <br/>
 */
public class HashTable {

    private StoredEmployee[] hashtable;

    public HashTable() {
        hashtable = new StoredEmployee[10];
    }

    /**
     * Linear probing.
     * If the specified index is occupied,
     * then keep incrementing the index by 1 until finding empty slot
     */
    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if (occupied(hashedKey)) {
            int stopIndex = hashedKey;
            if (hashedKey == hashtable.length - 1) {
                hashedKey = 0;
            } else {
                hashedKey++;
            }

            while (occupied(hashedKey) && hashedKey != stopIndex) {
                hashedKey = (hashedKey + 1) % hashtable.length;
            }
        }

        if (occupied(hashedKey)) {
            System.out.println("There is a value with the key: " + hashedKey);
        } else {
            hashtable[hashedKey] = new StoredEmployee(key, employee);
        }
    }

    public Employee get(String key) {
        int hashedKey = findKey(key);
        if (hashedKey == -1) {
            return null;
        }
        return hashtable[hashedKey].employee;
    }


    /**
     * Linear probing + Rehashing.
     * Rehashing the array to new array
     * to get rid of null values between the elements after deleting an element
     */
    public Employee remove(String key) {
        int hashedKey = findKey(key);

        if (hashedKey == -1) {
            return null;
        }
        Employee employee = hashtable[hashedKey].employee;
        hashtable[hashedKey] = null;
        StoredEmployee[] oldHashTable = hashtable;
        hashtable = new StoredEmployee[oldHashTable.length];
        for (int i = 0; i < oldHashTable.length; i++) {
            if (oldHashTable[i] != null) {
                put(oldHashTable[i].key, oldHashTable[i].employee);
            }
        }
        return employee;
    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    /**
     * Linear probing.
     * Keep incrementing the hashedKey by 1,
     * until we find the actual index of the object
     */
    private int findKey(String key) {
        int hashedKey = hashKey(key);
        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stopIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stopIndex &&
                hashtable[hashedKey] != null &&
                !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey + 1) % hashtable.length;
        }

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        } else {
            return -1;
        }
    }

    private boolean occupied(int index) {
        return hashtable[index] != null;
    }

    public void print() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i] == null) {
                System.out.println("empty");
            } else {
                System.out.println("Position " + i + ": " + hashtable[i].employee);
            }
        }
    }
}

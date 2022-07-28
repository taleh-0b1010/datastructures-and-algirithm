package com.java.datastructure.queue.arrayimpl;

public class Main {

    public static void main(String[] args) {

        ArrayQueue queue = new ArrayQueue(10);
        Employee jane = new Employee(1, "Jane", "Jones");
        Employee john = new Employee(2, "John", "Doe");
        Employee mary = new Employee(3, "Mary", "Smith");
        Employee mike = new Employee(4, "Mike", "Wilson");
        Employee bill = new Employee(5, "Bill", "End");
        queue.add(jane);
        queue.add(john);
        queue.remove();
        queue.add(mary);
        queue.remove();
        queue.add(mike);
        queue.remove();
        queue.add(bill);
        queue.remove();
        queue.add(jane);

        queue.printQueue();
    }
}

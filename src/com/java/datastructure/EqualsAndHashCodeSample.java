package com.java.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EqualsAndHashCodeSample {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Taleh");
        Employee employee2 = new Employee("Taleh");

        Map<Employee, String> map = new HashMap<>();
        map.put(employee1, "Taleh");
        map.put(employee2, "Taleh");
        System.out.println(map);

        map.remove(new Employee("Taleh"));
        System.out.println(map);

        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        System.out.println(list);
        list.remove(new Employee("Taleh"));
        System.out.println(list);
    }
}

class Employee {

    private final String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return name.equals(employee.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name);
//    }
}

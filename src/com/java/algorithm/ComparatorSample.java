package com.java.algorithm;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ComparatorSample {

    public static void main(String[] args) {
        new ComparatorSample().method();
    }

    private void method() {
        List<String> list = List.of("one", "x-one", "two", "x-two", "three", "x-three", "x-three", "x-three");
        List<String> orderedList = list.stream()
                .sorted(Comparator.comparing(s -> s.startsWith("x")))
                .filter(distinctByKey1(s -> s.startsWith("x")))
                .collect(Collectors.toList());
        System.out.println(orderedList);
    }

    public static <T> Predicate<T> distinctByKey1(Predicate<T> predicate) {
        Set<Object> seen = ConcurrentHashMap.newKeySet();
        return t -> {
            System.out.println(t);
            if (predicate.test(t)) {
                boolean b = seen.add(predicate.test(t));
                System.out.println(seen);
                return b;
            }
            return true;
        };
    }
}

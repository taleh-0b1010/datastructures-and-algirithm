package com.java.algorithm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        BigDecimal bigDecimal = new BigDecimal(4);
        System.out.println(bigDecimal.compareTo(BigDecimal.TEN));

    }

    Stream<BigDecimal> preprocess(Stream<BigDecimal> input) {
        if (input == null) {
            return Stream.empty();
        }
        List<BigDecimal> list = input
                .filter(Objects::nonNull)
                .filter(decimal -> decimal.compareTo(BigDecimal.ZERO) >= 0)
                .collect(Collectors.toList());
        if (list.isEmpty()) {
            return Stream.empty();
        }
        List<List<BigDecimal>> validTripleList = createTriples(list).stream()
                .filter(list1 -> getAverage(list1).compareTo(new BigDecimal(30)) <= 0)
                .collect(Collectors.toList());
        return validTripleList.stream()
                .flatMap(Collection::stream)
                .filter(decimal -> {
//                    Optional<Optional<BigDecimal>> normalizedValue = normalizer.normalize(decimal);
//                    return normalizedValue.isPresent();
                    return true;
                });
    }

    List<List<BigDecimal>> createTriples(List<BigDecimal> list) {
        List<List<BigDecimal>> tripleList = new ArrayList<>();
        List<BigDecimal> subList = new ArrayList<>();
        for (BigDecimal decimal : list) {
            if (subList.size() < 3) {
                subList.add(decimal);
            } else {
                tripleList.add(subList);
                subList.clear();
            }
        }
        return tripleList;
    }

    BigDecimal getAverage(List<BigDecimal> list) {
        BigDecimal sum = new BigDecimal(0);
        for (BigDecimal bigDecimal : list) {
            sum.add(bigDecimal);
        }
        return sum.divide(new BigDecimal(3), RoundingMode.FLOOR);
    }
}

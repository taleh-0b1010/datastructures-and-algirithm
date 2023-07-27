package com.java.algorithm;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Stream;

public class ListCheckNull {

    public static void main(String[] args) throws ParseException {
        String s = "Moscow,Baku,London";

        List<String> cityList = Arrays.asList(s.split(","));
        System.out.println(cityList);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.parse("2019-06-11"));

        Random random = new Random();
        String randomReportTitle = random.ints(97, 122 + 1)
                .limit(20)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        System.out.println(randomReportTitle);

        String s1 = String.valueOf(Long.parseLong("1"));
        System.out.println(s1);

        String amount = "1.009";
        BigDecimal bd = new BigDecimal(amount);

        System.out.println(bd.movePointRight(2));

        Long l = bd.longValue();
//        Long l1 = bd.subtract()
        String s2 = bd.multiply(new BigDecimal(100)).toString();
        System.out.println(s2);


        ZonedDateTime z1 = ZonedDateTime.now();
        ZonedDateTime z2 = ZonedDateTime.now();
        ZonedDateTime z3 = ZonedDateTime.now();

        List<ZonedDateTime> list = List.of(z2, z3, z1, z2);
        System.out.println(list);
        ZonedDateTime newer = list.stream().min((o1, o2) -> o2.compareTo(o1)).get();
        System.out.println(newer);

        System.out.println("叶尔夏提");
        String newS = "NEW";
        System.out.println(newS.equals(SampleEnum.NEW.name()));

        Map<String, Object> map = new HashMap<>();
        map.put("key", null);

        System.out.println(map.containsKey("key"));

        Long l1 = 5L;
        System.out.println("L: " + l1);

        Map<String, Object> map1 = new HashMap<>();
        System.out.println(map1.get("vcvx"));
    }

    private static void setL(Long l) {
        l = 4L;
    }
}

enum SampleEnum {
    NEW
}

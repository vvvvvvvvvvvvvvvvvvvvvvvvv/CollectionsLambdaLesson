package com.company;

import java.io.OutputStream;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        List<Integer> list = List.of(2, 4, 87, 23, 33, 45, 14, 500, 100, 20, 16, 45);
        OptionalDouble n = list.stream()
                .filter(res -> res % 2 != 0 && res % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
       // n.ifPresent(System.out::println);

        List<String> list1 = List.of("hu", "makaronnikx", "makaronnikx");
        long count =  list1.stream()
                .filter(value -> value.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(count);
        //System.out.println(OptionalDouble);

       Map<String, Integer> map =  Map.of(
                "hi", 2,
                "sgfsg", 4,
                "dadadafsfwrwrwrw", 7
        );
       int result = map.entrySet().stream()
               .filter(entry -> entry.getKey().length() < 7)
               .mapToInt(Map.Entry::getValue)
               .sum();
        System.out.println(result);

        List<Person1> person1s = List.of(
                new Person1(25, "Niko"),
                new Person1(5, "Alex"),
                new Person1(55, "Boris"),
                new Person1(46, "Leha"),
                new Person1(90, "Sany")
        );

          person1s.stream()
                .filter(value -> value.getName().length() < 15)
                .max(Comparator.comparing(Person1::getAge))
                  .map(Person1::getName)
                  .ifPresent(System.out::println);

    }

}

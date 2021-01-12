package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static java.util.stream.IntStream.of;

public class Streams {
    public static void main(String[] args) {
       /* List<String> strings = List.of("22", "11", "22", "33", "44", "55");
        strings.stream()
                .map(string -> string + string)
                .sorted()
                .skip(1)
                .limit(3)
                .forEach(System.out::println);
        IntStream.range(0, 10)
                .forEach(System.out::println);*/
        //Predicate
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).count();
        List<String> strings = List.of("11", "432", "1231", "4353");
        IntSummaryStatistics intSummaryStatistics =  strings.stream()
                .map(value -> value + value)
                .skip(1)
                .limit(2)
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .peek(value -> System.out.println(value))
                .summaryStatistics();

       // System.out.println(intSummaryStatistics);

        //DoubleStream
       // IntStream
        //LongStream
       // System.out.println(count);
        /*for (String res:strings) {
            String value = res + res;
            Integer intValue = Integer.valueOf(value);
            if(intValue % 2 == 0){
                System.out.println(intValue);
            }
        }*/


    }
}

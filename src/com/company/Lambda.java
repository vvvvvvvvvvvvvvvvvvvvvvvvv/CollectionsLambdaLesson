package com.company;

import java.util.Comparator;
import java.util.function.Function;


public class Lambda {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> {
          return Integer.compare(o1, o2);
        };


        Test test = (int x, int y) -> x +y;
        System.out.println(test.calculate(10, 10));

        Comparator<Integer> comparator1 = Integer::compare;
        System.out.println(comparator1.compare(100, 100));
    }
/* static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }*/

interface Test {
    int calculate(int x, int y);
}
}


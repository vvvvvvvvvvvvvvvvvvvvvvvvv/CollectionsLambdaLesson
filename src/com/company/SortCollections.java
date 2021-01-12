package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortCollections {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(2, "hsfsf"));
        list.add(new Person(7, "aa"));
        list.add(new Person(4, "fhfh"));
        list.add(new Person(3, "zxx"));

        Collections.sort(list, new FirstNameComparator());
        System.out.println(list);
    }

    public static class FirstNameComparator implements Comparator<Person>{
        @Override
        public int compare(Person o1, Person o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

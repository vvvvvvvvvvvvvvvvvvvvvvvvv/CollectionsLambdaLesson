package com.company;

import java.util.Map;
import java.util.TreeMap;

public class ThreeMap {
    public static void main(String[] args) {
        Person ivan = new Person(1, "name");
        Person ivan2 = new Person(2, "nam");
        Map<Integer, Person> map = new TreeMap<>();
        map.put(4, ivan);
        map.put(2, ivan);
        map.put(5, ivan);
        map.put(88, ivan);
        map.put(14, ivan);
        map.put(1, ivan);

        for (Map.Entry<Integer, Person> res : map.entrySet()){
            System.out.println(res.getKey() + " " + res.getValue());
        }

    }

}

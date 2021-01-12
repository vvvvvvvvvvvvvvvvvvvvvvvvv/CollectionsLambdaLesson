package com.company;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {

        Person ivan = new Person(1, "name");
        Person ivan2 = new Person(2, "nam");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(ivan2.getId(), ivan2);
       /* System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());*/

       /* for (Person person: map.values()) {
            System.out.println(person.getName());
        }*/
        for (Map.Entry<Integer, Person> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}

package com.company;

public class GarbageCollector {
    public static void main(String[] args) {
        Person person = new Person(1, "Nikolay");
        Person person1 = person;
        System.out.println(person1.getName());

    }

}

package com.company;

import java.lang.ref.PhantomReference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class References {
    public static void main(String[] args) {
        Person person = new Person(1, "Oleg");

        WeakReference<Person> weakReference = new WeakReference<Person>(person);
        SoftReference<Person>  softReference = new SoftReference<>(person);
      //  PhantomReference<Person> personPhantomReference = new PhantomReference(person);

        System.out.println(weakReference.get().getName());
        person = null;

    }
}

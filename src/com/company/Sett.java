package com.company;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sett {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(13);
        set.add(3);
        set.add(7);

      /*  System.out.println(set.contains(13));
        for (Integer res: set) {
            System.out.println(res);
        }*/
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

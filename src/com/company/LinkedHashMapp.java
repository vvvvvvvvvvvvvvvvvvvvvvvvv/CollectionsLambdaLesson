package com.company;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapp {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "ten");
        map.put(2, "two");
        map.put(1, "one");
        for (Map.Entry<Integer, String> res : map.entrySet()) {
            System.out.println(res.getKey() + " " + res.getValue());
        }
    }
}

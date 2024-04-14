package com.michael.learnjava.ch06_collections;

import java.util.*;

public class CollectionUtils {
    public static void main(String[] args) {
        copy();
    }

    private static void copy() {
        List<String> list1 = Arrays.asList("s1", "s2");
        List<String> list2 = Arrays.asList("s3", "s4", "s5", "s6");
        Collections.copy(list2, list1);
        System.out.println(list2);

    }
}


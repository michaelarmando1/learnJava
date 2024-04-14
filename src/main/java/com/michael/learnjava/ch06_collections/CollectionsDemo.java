package com.michael.learnjava.ch06_collections;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        //initialize1();
        //initialize2();
        //initialize3();
        //iterable();
        map();

    }

    public static void map() {
        Map<Integer, String> map = Map.of(1, "s1", 2, "s2", 3, "s3");

//        for(Integer key: map.keySet()) {
//            System.out.print(key + ": " + map.get(key) + ", ");
//        }

        for(Map.Entry e : map.entrySet()) {
            System.out.print(e.getKey() + " : " + e.getValue() + ", ");
        }
    }

    public static void iterable() {
        Iterable<String> list = List.of("s1", "s2", "s3");
        //System.out.println(list);

        for(String e: list) {
            //System.out.print(e + " ");
        }

        list.forEach(e -> System.out.print(e + " "));  // -> lambda
    }

    public static void initialize1() { // List Examples
        Collection<String> col1 = List.of("s1", "s2", "s3");
        //System.out.println(col1);

        col1 = Set.of("s4", "s5", "s6");
        //System.out.println(col1);
    }

    public static void initialize2() {
        // creating an arraylist
        List<String> list1 = new ArrayList<>();

        // add an item to the arraylist
        list1.add("l1");
        list1.add("l1");
        //System.out.println(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("s4");
        list2.addAll(list1);
        //System.out.println(list2);

        Set<String> set1 = new HashSet<>();

        set1.add("s1");
        set1.add("s1");

        set1.addAll(list1);
        //System.out.println(set1);

        //System.out.println(set1);
    }

    public static void initialize3() {

        Collection<String> list1 = List.of("s1", "s1", "s2");
        //System.out.println(list1);

        List<String> list2 = new ArrayList<>(list1);
        //System.out.println(list2);

        Set<String> set = new HashSet<>(list1);
        //System.out.println(set);
    }
}

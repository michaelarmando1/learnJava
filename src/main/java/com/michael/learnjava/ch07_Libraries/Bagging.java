package com.michael.learnjava.ch07_Libraries;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.IterableMap;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;
import org.apache.commons.collections4.map.HashedMap;

import java.util.Map;

public class Bagging {
    public static void main(String[] args) {
        //bagging();
        //bidiMap();
        mapIterator();
    }

    private static void bagging() {
        // CREATING A BAG OF STRINGS
        Bag <String> bag = new HashBag<>();
        Bag <Integer> intMyBag = new HashBag<>();

        bag.add("one", 4);
        intMyBag.add(15, 10);
        //System.out.println(bag);

        bag.remove("one", 1);
        intMyBag.remove(15, 5);
        //System.out.println(bag);
        //System.out.println(bag.getCount("one"));
        //System.out.println(intMyBag);
    }

    public static void bidiMap() {
        BidiMap <Integer, String> bidi = new TreeBidiMap<>();
        BidiMap <String, Integer> bidiReverse = new TreeBidiMap<>();

        bidi.put(2, "two");
        bidiReverse.put("five", 5);

        bidi.put(3, "three");

        bidi.put(4, "four");

        //System.out.println(bidi);

        //System.out.println(bidi.inverseBidiMap());

        //System.out.println(bidi.get(4));

        //System.out.println(bidi.getKey("four"));

        bidi.remove(2);

        //System.out.println(bidi);

    }

    private static void mapIterator() {
        IterableMap<Integer, String> map = new HashedMap<>(Map.of(1, "one", 2, "two"));
        MapIterator it = map.mapIterator();
        while(it.hasNext()) {
            Object key = it.next();
            Object value = it.getValue();
            System.out.println(key + ", " + value + ",");

            if(((Integer)key) == 2){
                it.setValue("three");
            }
        }
        System.out.println("\n" + map);
    }

}

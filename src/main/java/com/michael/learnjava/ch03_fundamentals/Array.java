package com.michael.learnjava.ch03_fundamentals;

public class Array {
    public static void main(String... args) {
        array1();
    }

    private static void array1() {
        int[] intArray = {1,2,3,4,5,6,7,8,9,10};
        double[][] doubleArray = {{1.1, 2.2, 3, 2}, {10, 20, 30, 5}, {1, 2, 3, 4}};
        //String[] stringArray = new String[2];
        //SomeClass[][][] arr = new SomeClass[3][5][2];
        //String[] stringArray = {"abc", "a23"};
        System.out.println(java.util.Arrays.toString(intArray));
    }
}

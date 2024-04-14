package com.michael.learnjava.cho4_exceptions;

public class Framework {
    public static void main(String[] args) {
        //method();
        catchException1();
    }

    public static void catchException1() {
        try {
            method("s");
        }
        catch(Exception ex) {
            System.out.println(ex.getClass().getCanonicalName());
            ex.printStackTrace();
        }
    }

    public static void method(String s) {
        if (s.equals("abc")) {
            System.out.println("s equals abc");
        }
        else {
            System.out.println("s is not equals to abc");
        }
    }


}


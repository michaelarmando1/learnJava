package com.michael.learnjava.ch03_fundamentals;

public class ReferenceTypes {
    public static void main(String... args) {
        enumDemo();
    }

    private static void enumDemo(){
        Season season = Season.WINTER;
        System.out.println(season);
        System.out.println(Season.WINTER.ordinal());
    }

    enum Season {
        SPRING,
        SUMMER,
        AUTUMN,
        WINTER
    }



    interface C {}
    interface B extends C {}
    class A implements B { }
    B b = new A();
    C c = new A();
    A a1 = (A)b;

    A a2 = (A)c;


}

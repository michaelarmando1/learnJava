package com.michael.learnjava.ch03_fundamentals;

import com.michael.learnjava.ch02_oop.hiding.C;
import com.michael.learnjava.ch02_oop.hiding.D;

import static com.michael.learnjava.ch02_oop.StaticMembers.SomeClass.SOME_PROPERTY;
import static com.michael.learnjava.ch02_oop.StaticMembers.SomeClass.someMethod;

public class Packages {
    public static void main(String... args) {
        C c = new C();
        D d = new D();

        // SomeClass obj = new SomeClass()
        someMethod(42);
        System.out.println(SOME_PROPERTY);
    }
}

package com.michael.learnjava.ch09_jvm;

public class MyApplication {
    public static void main(String... args) {
        System.out.println("Program Arguments are: "); //prints: Hello, world!
        //prints all program arguments
        for(String arg: args) {
            System.out.print(arg + " ");
        }
//        }

        // prints value of VM options someParameter
        String p = System.getProperty("someParameter");
        System.out.println("\n vm options are: " + p);

        String s = System.getProperty("someParam2");
        System.out.println("\n vm options are: " + s);

        //prints values of environment variables
        String u = System.getenv("someVar");
        System.out.println("\n Environment variables are " +u);

        String someVar2 = System.getenv("someVar2");
        System.out.println("\n" + someVar2);
    }
}

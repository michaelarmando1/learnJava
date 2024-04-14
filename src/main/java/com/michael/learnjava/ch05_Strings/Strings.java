package com.michael.learnjava.ch05_Strings;

public class Strings {
    public static void main(String[] args) {
        //length();
        //isEmpty();
        //indexOf();
        //contains();
        substring();
        format();
        concat();
    }

    public static void length() {
        String s7 = "42";
        //System.out.println(s7.length());
    }

    private static void isEmpty() {
        //System.out.println(" ".isEmpty());
        //System.out.println("".isBlank());

    }

    private static void indexOf() {
        //String s6 = "abc42t%";
        //System.out.println(s6.indexOf("%"));
        //System.out.println("ebebbeeb eb eb".lastIndexOf("eb"));

//        String s4 = "aBc";
//        String s5 = "Abc";
//
//        System.out.println(s4.compareTo(s5));


    }

    private static void contains() {
//        String s6 = "abc42t%";
//        String s7 = "42";
//        String s8 = "xyz";

//        System.out.println(s6.contains(s7));
//        System.out.println(s6.contains("ac"));
//        System.out.println(s6.contains(s8));

//        System.out.println(s6.startsWith("abc"));
//        System.out.println(s6.endsWith("2t%"));
//        System.out.println(s6.startsWith("42", 3));
//        System.out.println(s6.endsWith("%"));


    }

    private static void substring() {
        System.out.println("42".substring(0));
        System.out.println("42".substring(1));
        System.out.println("42".substring(2));
        System.out.println("42".substring(0,1));

        String s6 = "abc42t%";
        System.out.println(s6.substring(3,6));
    }

    private static void format(){
        String t = "Hey, %s! Give me %d apples, Please.";
        System.out.println(String.format(t, "Shola", 419));

        String t1 = String.format(t, "Nick", 32);
        System.out.println(t1);


    }

    public static void concat() {
        String s7 = "42";
        String s8 = "xyz";
        String newStr1 = s7.concat(s8);
        System.out.println(newStr1);
    }
}

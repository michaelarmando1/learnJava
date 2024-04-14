package com.michael.learnjava.ch02_oop;

public class AnotherClass {
    public static void main(String[] args){
        AnotherClass an = new AnotherClass();
        for(String s: args){
            an.display(s);
        }

    }
    private int result;

    public void display(String s) {
        System.out.println(result);
    }

    public int process(int i) {
        result = i * 2;
        return result;
    }

    public int getResult(){
        return result;
    }
}



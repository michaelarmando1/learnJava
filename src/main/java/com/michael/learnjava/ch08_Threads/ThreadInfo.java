package com.michael.learnjava.ch08_Threads;

import java.util.concurrent.TimeUnit;

public class ThreadInfo implements Runnable{

    private String parameter, name;

    // CONSTRUCTOR
    public ThreadInfo(String parameter, String name) {

        this.parameter = parameter;
        this.name = name;
    }


    public void run() {
        while (!"exit".equals(parameter)){
            System.out.println();
            pauseFiveSeconds();
        }
    }

    private static void pauseFiveSeconds() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }
}



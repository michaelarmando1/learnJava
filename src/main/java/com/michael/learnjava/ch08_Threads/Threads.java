package com.michael.learnjava.ch08_Threads;

public class Threads {
    public static void main(String[] args) {
         for(int i = 0; i <= 5; i++) {
             Counter th1 = new Counter();

             th1.start();
         }
    }

    public static class Counter extends Thread {

        @Override
        public void run() {
            for ( int i = 0; i <=5; i++) {
                System.out.println(i);


                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }

}

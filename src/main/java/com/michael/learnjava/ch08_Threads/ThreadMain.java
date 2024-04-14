//package com.michael.learnjava.ch08_Threads;
//
//import java.util.concurrent.TimeUnit;
//
//public class ThreadMain {
//
//    public static void main(String... args) {
//        ThreadInfo tr2 = new ThreadInfo("Two");
//        ThreadInfo tr1 = new ThreadInfo("One");
////        tr2.setDaemon(true);
////
////        tr2.start();
////        tr1.start();
//
//        pauseFiveSeconds();
//        tr2.setParameter("exit");
//        pauseFiveSeconds();
//        System.out.println("Main Thread Exists");
//    }
//
//    private static void pauseFiveSeconds() {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}

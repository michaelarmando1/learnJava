package com.michael.learnjava.cho4_exceptions;

public class CustomExceptions {
    class MyCheckedException extends Exception {

        public MyCheckedException (String message) {
            super(message);
        }
    }

    class MyUncheckedException extends RuntimeException {


        public MyUncheckedException(String message) {
            super(message);
        }
    }

}

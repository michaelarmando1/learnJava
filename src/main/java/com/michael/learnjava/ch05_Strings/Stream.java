package com.michael.learnjava.ch05_Strings;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;

public class Stream {
    public static void main(String[] args) {
        byteSource();
        byteArrayInputStream1();
        fileInputStream1();
    }

    private static byte[] byteSource() {
        // creates a byte
        return new byte[] {42,43,44};
    }

    private static void byteArrayInputStream1() {
        // creating a buffer
        byte[] buffer = byteSource();

        try(ByteArrayInputStream bais = new ByteArrayInputStream(buffer)){
            int data = bais.read();
            while (data != -1){
                //System.out.print(data + ","); //prints: 42 43 44
                // reading the bytes using the read() function
                data = bais.read();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void fileInputStream1() {
        // create a variable to store the file path
        String filePath = "src/main/resources/hello.txt";
        try(FileInputStream fis = new FileInputStream(filePath)) {
            int data;
            while( (data = fis.read()) != -1) {
                System.out.print(((char)data) + " ");  //prints H e l l o
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

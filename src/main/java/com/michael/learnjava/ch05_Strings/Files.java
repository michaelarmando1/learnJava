package com.michael.learnjava.ch05_Strings;

import java.io.File;

public class Files {

    public static void main(String[] args) {
        // createFile1();
        // createFile2();
        list1();
    }

    private static void list1() {
        //
        String path1 = "folder1" + File.separator + "folder2" + File.separator; // / or \
//        String path2 = "folder2" + File.separator;
//        String path = path1 + path2;
        File f1 = new File(path1 + "file1.txt");
        File f2 = new File(path1 + "file2.txt");

        File dir = new File(path1);
        try {
            dir.mkdirs();
            f1.createNewFile();
            f2.createNewFile();

            for (String d: dir.list()){
                System.out.print(d + "");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    private static void createFile1(){
        File f = new File("ournewfile.txt");
        try {
            f.createNewFile();
            // f.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

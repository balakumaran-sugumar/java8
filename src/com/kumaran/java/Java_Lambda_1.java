package com.kumaran.java;

import java.io.File;
import java.io.FileFilter;

public class Java_Lambda_1 {

    public static void main(String ... args) throws InterruptedException{

        File file = new File("C:\\projects\\feb\\Java8Examples\\src\\");

        //this is using Java 8 execution
        FileFilter filters8 = (File pathname) -> pathname.getName().endsWith(".java");

        File[] fileFilter8 = file.listFiles(filters8);

        for (File file1 : fileFilter8){
            System.out.println("Java8" + file1);
        }

        //multi block lambda expression
        Runnable runnable8 = () -> {
            for(int i = 0; i<3; i++)
                  System.out.println("Running the thread " + i);
        };

        Thread test = new Thread(runnable8);
        test.start();
        test.join();
    }
}

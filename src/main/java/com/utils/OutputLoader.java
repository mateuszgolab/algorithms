package com.utils;


import java.io.*;

public class OutputLoader {

    public static boolean output(String value, String fileName) {

        try {

            String dir = OutputLoader.class.getResource("/").getFile().replace("/target/test-classes", "/src/main/resources");
            OutputStream os = new FileOutputStream(dir + fileName);
            PrintStream printStream = new PrintStream(os);
            printStream.println(value);
            printStream.close();

            return true;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }
}

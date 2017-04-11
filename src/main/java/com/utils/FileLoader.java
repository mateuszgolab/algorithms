package com.utils;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class FileLoader {

    public static String get(String fileName) {

        InputStream stream = FileLoader.class.getClassLoader().getResourceAsStream(fileName);
        try {
            return IOUtils.toString(stream, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "";
    }
}

package com.utils;


import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputLoader {

    public static String getInput(String fileName) {

        InputStream stream = InputLoader.class.getClassLoader().getResourceAsStream(fileName);
        try {
            return IOUtils.toString(stream, Charset.forName("UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "";
    }
}

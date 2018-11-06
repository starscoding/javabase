package com.azxx.demon.io.inputstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    private static Logger logger = LoggerFactory.getLogger(FileDemo.class);

    public static void main(String[] args) {
        logger.info("hello log!");
    }

    public void createFile(){
        String path = "";
        String fileName = "";
        File file = new File(path+fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

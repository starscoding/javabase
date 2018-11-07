package com.azxx.demon.io.inputstream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;


/**
 * Created by Smile on 2018/11/7.
 */
public class InputstreamDemon {

    private static Logger logger = LoggerFactory.getLogger(InputstreamDemon.class);

    public static void main(String[] args) {
        File file = new File("D:\\test.txt");
        try {
            FileInputStream in = new FileInputStream(file);
            logger.info("available:",in.available());
            logger.info("read:",in.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

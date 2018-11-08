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
        print("D:\\test.txt");
    }

    public static void print(String pathname){
        File file = new File(pathname);
        if(!file.exists()){
            return;
        }
        try {
            FileInputStream in = new FileInputStream(file);
            byte[] bytes = new byte[1];
            int length = 0;
            while ((length = in.read(bytes))!=-1){
                logger.info("读取到信息长度：{}",length);
                logger.info(new String(bytes));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package com.azxx.demon.io.inputstream;

import com.azxx.demon.properties.PropUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * Created by Smile on 2018/11/12.
 */
public class ObjectInpustreamDemon {

    private static Logger logger = LoggerFactory.getLogger(ObjectInpustreamDemon.class);

    public static void main(String[] args) {
        String pathname = PropUtils.get("pathname");
        try {
            ObjectInputStream in = new ObjectInputStream(getInputStream(pathname));
            logger.info("获取文件内容：{}",in.readObject());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static InputStream getInputStream(String pathname){
        File file = new File(pathname);
        try {
            FileInputStream inputStream = new FileInputStream(file);
            return inputStream;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return  null;
        }
    }
}

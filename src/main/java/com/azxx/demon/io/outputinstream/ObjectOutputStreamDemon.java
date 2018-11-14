package com.azxx.demon.io.outputinstream;

import com.azxx.demon.properties.PropUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class ObjectOutputStreamDemon {

    private static Logger logger = LoggerFactory.getLogger(ObjectOutputStreamDemon.class);

    public static void main(String[] args) {
        String pathname = PropUtils.get("pathname");
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(getOutputStream(pathname));
            out.write(123);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(out);
        }
    }

    public static void close(OutputStream outputStream){
        if(outputStream==null){
            return;
        }
        try {
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static OutputStream getOutputStream(String pathname){
        try {
            FileOutputStream out = new FileOutputStream(pathname);
            return out;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return  null;
        }
    }


}

package com.azxx.demon.properties;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemon {

    private static Logger logger = LoggerFactory.getLogger(PropertiesDemon.class);

    public static void main(String[] args) {
        String pathname = "src/main/resources/app.properties";
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(pathname));
            logger.info(properties.get("pathname").toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


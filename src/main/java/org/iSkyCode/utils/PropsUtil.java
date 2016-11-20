package org.iSkyCode.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by phoenix on 2016/11/20.
 */
public class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    public static Properties loadProps(String filename) {
        Properties properties = null;
        InputStream inputStream = null;

        try {
            inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
            if (inputStream == null) {
                throw new FileNotFoundException(filename + "is not found");
            }
            properties = new Properties();
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            LOGGER.error("load props failed", e);
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return properties;
        }
    }

    public static String getString(Properties properties, String key, String defaultValue) {
        String value = defaultValue;
        if (properties.contains(key)) {
            value = properties.getProperty(key);
        }
        return value;
    }

    public static String getString(Properties properties, String key) {
        return getString(properties, key, "");
    }
}

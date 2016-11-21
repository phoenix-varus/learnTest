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

    /*
    * TODO 初始化从文件获取数据
    * */
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

    /*
    * TODO 获取字符串型属性
    * */
    public static String getString(Properties properties, String key, String defaultValue) {
        String value = defaultValue;
        if (properties.contains(key)) {
            value = properties.getProperty(key);
        }
        return value;
    }

    /*
    *TODO 获取字符串型属性（默认为空）
    * */
    public static String getString(Properties properties, String key) {
        return getString(properties, key, "");
    }

    /*
    * TODO 获取数值型属性
    * */
    public static int getInt(Properties properties, String key, int defaultValue) {
        int value = defaultValue;
        if (properties.contains(key)) {
            value = CastUtil.castInt(properties.getProperty(key));
        }
        return value;
    }

    /*
    * TODO 获取数值型属性（默认值为0）
    * */
    public static int getInt(Properties properties, String key) {
        return getInt(properties, key, 0);
    }

    /*
    * TODO 获取布尔型属性（默认值为false）
    * */
    public static boolean getBoolean(Properties properties, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (properties.contains(key)) {
            value = CastUtil.castBoolean(properties.getProperty(key));
        }
        return value;
    }

    /*
    * TODO 获取布尔型属性
    * */
    public static boolean getBoolean(Properties properties, String key) {
        return getBoolean(properties, key, false);
    }
}

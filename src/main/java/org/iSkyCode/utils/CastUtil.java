package org.iSkyCode.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by phoenix on 2016/11/21.
 */
public final class CastUtil {
    /*
    * TODO 转为String型
    * */
    public static String castString(Object object, String defaultValue) {
        return object != null ? String.valueOf(object) : defaultValue;
    }

    /*
    * TODO 转为String型（默认值为空）
    * */
    public static String castString(Object object) {
        return castString(object, "");
    }

    /*
    * TODO 转为Double型
    * */
    public static double castDouble(Object object, double defaultValue) {
        double value = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtils.isNotEmpty(strValue)) {
                value = Double.parseDouble(strValue);
            }
        }
        return value;
    }

    /*
    * TODO 转为Double型（默认值为0）
    * */
    public static double castDouble(Object object) {
        return castDouble(object, 0);
    }

    /*
    * TODO 转为Long型
    * */
    public static long castLong(Object object, long defaultValue) {
        long value = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtils.isNotEmpty(strValue)) {
                value = Long.parseLong(strValue);
            }
        }
        return value;
    }

    /*
    * TODO 转为Long型（默认值为0）
    * */
    public static long castLong(Object object) {
        return castLong(object, 0);
    }

    /*
    * TODO 转为Int型
    * */
    public static int castInt(Object object, int defaultValue) {
        int value = defaultValue;
        if (object != null) {
            String strValue = castString(object);
            if (StringUtils.isNotEmpty(strValue)) {
                value = Integer.parseInt(strValue);
            }
        }
        return value;
    }

    /*
    * TODO 转为Int型（默认值为0）
    * */
    public static int castInt(Object object) {
        return castInt(object, 0);
    }

    /*
    * TODO 转为Boolean型
    * */
    public static boolean castBoolean(Object object, boolean defaultValut) {
        boolean value = defaultValut;
        if (object != null) {
            value = Boolean.parseBoolean(castString(object));
        }
        return value;
    }

    /*
    * TODO 转为Boolean型（默认值为false）
    * */
    public static boolean castBoolean(Object object) {
        return castBoolean(object, false);
    }
}

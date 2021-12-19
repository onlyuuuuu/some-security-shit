package com.onlyu.base.demo00.ultilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {

    private static SimpleDateFormat DATE_FORMAT;

    public static SimpleDateFormat getDefaultSimpleDateFormatInstance() {
        if (DATE_FORMAT == null)
            DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        return DATE_FORMAT;
    }

    public static SimpleDateFormat getSimpleDateFormatInstance(String format) {
        if (DATE_FORMAT == null)
            DATE_FORMAT = new SimpleDateFormat(format);
        return DATE_FORMAT;
    }

    public static String now() {
        return getDefaultSimpleDateFormatInstance().format(new Date());
    }

}

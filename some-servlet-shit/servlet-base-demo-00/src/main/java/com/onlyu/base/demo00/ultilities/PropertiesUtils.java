package com.onlyu.base.demo00.ultilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtils {

    private static Properties PROPERTIES;

    public static Properties getDefaultPropertiesInstance() throws IOException {
        if (PROPERTIES == null) {
            ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
            InputStream input = classLoader.getResourceAsStream("jaxb-classes.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(input);
        }
        return PROPERTIES;
    }

}

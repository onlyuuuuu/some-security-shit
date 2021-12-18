package com.onlyu.oauth2demo01.factories;

import com.onlyu.oauth2demo01.servlets.impl.JsonApplicationProcess;
import com.onlyu.oauth2demo01.servlets.impl.XmlApplicationProcess;

public class ProcessFactory {

    private static JsonApplicationProcess JSON_APPLICATION_PROCESS;
    private static XmlApplicationProcess XML_APPLICATION_PROCESS;

    public static JsonApplicationProcess getJsonApplicationProcessInstance() {
        if (JSON_APPLICATION_PROCESS == null)
            JSON_APPLICATION_PROCESS = new JsonApplicationProcess();
        return JSON_APPLICATION_PROCESS;
    }

    public static XmlApplicationProcess getXmlApplicationProcessInstance() {
        if (XML_APPLICATION_PROCESS == null)
            XML_APPLICATION_PROCESS = new XmlApplicationProcess();
        return XML_APPLICATION_PROCESS;
    }

}

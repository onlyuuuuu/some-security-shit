package com.onlyu.base.demo00.factories;

import com.onlyu.base.demo00.servlets.impl.JsonAppProcessor;
import com.onlyu.base.demo00.servlets.impl.XmlAppProcessor;

public class ProcessorFactory {

    private static JsonAppProcessor JSON_APPLICATION_PROCESS;
    private static XmlAppProcessor XML_APPLICATION_PROCESS;

    public static JsonAppProcessor getJsonApplicationProcessInstance() {
        if (JSON_APPLICATION_PROCESS == null)
            JSON_APPLICATION_PROCESS = new JsonAppProcessor();
        return JSON_APPLICATION_PROCESS;
    }

    public static XmlAppProcessor getXmlApplicationProcessInstance() {
        if (XML_APPLICATION_PROCESS == null)
            XML_APPLICATION_PROCESS = new XmlAppProcessor();
        return XML_APPLICATION_PROCESS;
    }

}

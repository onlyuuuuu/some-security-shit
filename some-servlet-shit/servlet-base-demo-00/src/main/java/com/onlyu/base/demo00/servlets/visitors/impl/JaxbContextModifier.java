package com.onlyu.base.demo00.servlets.visitors.impl;

import com.onlyu.base.demo00.dtos.responses.Response;
import com.onlyu.base.demo00.servlets.impl.XmlAppProcessor;
import com.onlyu.base.demo00.servlets.visitors.XmlAppProcessorVisitor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.util.Arrays;

public class JaxbContextModifier implements XmlAppProcessorVisitor {

    private Class[] contextClasses;

    public JaxbContextModifier(Class[] contextClasses) {
        this.contextClasses = contextClasses;
    }

    @Override
    public void visit(XmlAppProcessor xmlAppProcessor) {
        try {
            Class[] classes = Arrays.copyOf(contextClasses, contextClasses.length + 1);
            classes[contextClasses.length] = Response.class;
            xmlAppProcessor.setJaxbContext(JAXBContext.newInstance(classes));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}

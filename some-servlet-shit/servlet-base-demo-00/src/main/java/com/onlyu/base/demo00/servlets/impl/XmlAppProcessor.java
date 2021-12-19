package com.onlyu.base.demo00.servlets.impl;

import com.onlyu.base.demo00.dtos.responses.Response;
import com.onlyu.base.demo00.servlets.visitors.ProcessorVisitorAcceptor;
import com.onlyu.base.demo00.servlets.visitors.XmlAppProcessorVisitor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class XmlAppProcessor implements Processor, ProcessorVisitorAcceptor<XmlAppProcessorVisitor> {

    private static JAXBContext JAXB_CONTEXT;

    public XmlAppProcessor() {
        try {
            this.JAXB_CONTEXT = JAXBContext.newInstance(Response.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp, Response data) throws IOException {
        PrintWriter writer = resp.getWriter();
        // marshal
        String xmlString;
        try {
            Marshaller marshaller = JAXB_CONTEXT.createMarshaller();
            StringWriter sw = new StringWriter();
            marshaller.marshal(data, sw);
            xmlString = sw.toString();
        } catch (Exception e) {
            e.printStackTrace();
            xmlString = "[ERROR PARSING RESPONSE]";
        }
        resp.setContentType("application/xml;charset=UTF-8");
        writer.write(xmlString);
        writer.flush();
    }

    @Override
    public void accept(XmlAppProcessorVisitor visitor) {
        visitor.visit(this);
    }

    public void setJaxbContext(JAXBContext jaxbContext) {
        JAXB_CONTEXT = jaxbContext;
    }
}

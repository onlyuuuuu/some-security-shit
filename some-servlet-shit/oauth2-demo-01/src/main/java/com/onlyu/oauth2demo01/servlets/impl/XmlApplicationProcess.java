package com.onlyu.oauth2demo01.servlets.impl;

import com.onlyu.oauth2demo01.dtos.responses.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

public class XmlApplicationProcess implements Process {

    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp, Response data) throws IOException {
        PrintWriter writer = resp.getWriter();
        // marshal
        String xmlString;
        try {
            JAXBContext context = JAXBContext.newInstance(Response.class);
            Marshaller marshaller = context.createMarshaller();
            StringWriter sw = new StringWriter();
            marshaller.marshal(data, sw);
            xmlString = sw.toString();
        } catch (JAXBException e) {
            e.printStackTrace();
            xmlString = "[ERROR PARSING RESPONSE]";
        }
        resp.setContentType("application/xml;charset=UTF-8");
        writer.write(xmlString);
        writer.flush();
    }
}

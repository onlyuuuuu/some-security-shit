package com.onlyu.base.demo00.servlets.impl;

import com.onlyu.base.demo00.dtos.responses.Response;
import com.onlyu.base.demo00.factories.GsonFactory;
import com.onlyu.base.demo00.servlets.visitors.ProcessorVisitorAcceptor;
import com.onlyu.base.demo00.servlets.visitors.JsonAppProcessorVisitor;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class JsonAppProcessor implements Processor, ProcessorVisitorAcceptor<JsonAppProcessorVisitor> {

    @Override
    public void process(HttpServletRequest req, HttpServletResponse resp, Response data) throws IOException {
        PrintWriter writer = resp.getWriter();
        // serialize
        String jsonString;
        try {
            jsonString = GsonFactory.getInstance().toJson(data);
        } catch (Exception e) {
            e.printStackTrace();
            jsonString = "[ERROR PARSING RESPONSE]";
        }
        resp.setContentType("application/json;charset=UTF-8");
        writer.write(jsonString);
        writer.flush();
    }

    @Override
    public void accept(JsonAppProcessorVisitor visitor) {
        visitor.visit(this);
    }
}

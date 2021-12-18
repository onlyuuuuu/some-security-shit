package com.onlyu.oauth2demo01.servlets.impl;

import com.onlyu.oauth2demo01.factories.GsonFactory;
import com.onlyu.oauth2demo01.dtos.responses.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class JsonApplicationProcess implements Process {

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

}

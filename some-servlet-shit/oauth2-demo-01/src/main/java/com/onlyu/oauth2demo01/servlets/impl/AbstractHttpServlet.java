package com.onlyu.oauth2demo01.servlets.impl;

import com.onlyu.oauth2demo01.dtos.responses.Response;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class AbstractHttpServlet<T> extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessResponse().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessResponse().process(req, resp, processRequest(req, resp));
    }

    protected abstract Process getProcessResponse();

    protected abstract Response<T> processRequest(HttpServletRequest req, HttpServletResponse resp);

}

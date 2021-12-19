package com.onlyu.base.demo00.servlets.impl;

import com.onlyu.base.demo00.dtos.responses.Response;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public abstract class AbstractHttpServlet<T> extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    @Override
    protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getProcessor().process(req, resp, processRequest(req, resp));
    }

    protected abstract Processor getProcessor();

    protected abstract Response<T> processRequest(HttpServletRequest req, HttpServletResponse resp);

}

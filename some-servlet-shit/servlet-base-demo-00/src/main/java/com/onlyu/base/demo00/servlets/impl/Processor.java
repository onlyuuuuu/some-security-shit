package com.onlyu.base.demo00.servlets.impl;

import com.onlyu.base.demo00.dtos.responses.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Processor {

    void process(HttpServletRequest req, HttpServletResponse resp, Response data) throws IOException;

}

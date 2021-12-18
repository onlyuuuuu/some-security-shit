package com.onlyu.oauth2demo01.servlets.impl;

import com.onlyu.oauth2demo01.dtos.responses.Response;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Process {

    void process(HttpServletRequest req, HttpServletResponse resp, Response data) throws IOException;

}

package com.onlyu.oauth2demo01.servlets.v2;

import com.onlyu.oauth2demo01.dtos.responses.AppResp;
import com.onlyu.oauth2demo01.dtos.responses.Response;
import com.onlyu.oauth2demo01.factories.ProcessFactory;
import com.onlyu.oauth2demo01.servlets.impl.AbstractHttpServlet;
import com.onlyu.oauth2demo01.servlets.impl.Process;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(urlPatterns = {"/v2/app"})
public class AppProcessResponseServlet extends AbstractHttpServlet<AppResp> {

    @Override
    protected Process getProcessResponse() {
        return ProcessFactory.getJsonApplicationProcessInstance();
    }

    @Override
    protected Response<AppResp> processRequest(HttpServletRequest req, HttpServletResponse resp) {
        Response<AppResp> response = new Response<>();
        response.setTimestamp(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(new Date()));
        response.setStatus(resp.getStatus());
        response.setData(new AppResp("onlyu.com", "domain"));
        return response;
    }
}

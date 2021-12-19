package com.onlyu.demo01.servlets.v1;

import com.onlyu.base.demo00.dtos.responses.Response;
import com.onlyu.base.demo00.factories.ProcessorFactory;
import com.onlyu.base.demo00.servlets.impl.AbstractHttpServlet;
import com.onlyu.base.demo00.servlets.impl.Processor;
import com.onlyu.demo01.dtos.reponses.Output;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/v1/demo1"})
public class SimpleJsonServlet extends AbstractHttpServlet<Output> {

    @Override
    protected Processor getProcessor() {
        return ProcessorFactory.getJsonApplicationProcessInstance();
    }

    @Override
    protected Response<Output> processRequest(HttpServletRequest req, HttpServletResponse resp) {
        return Response.newInstance(resp, () -> new Output("onlyu.com", "domain"));
    }

}

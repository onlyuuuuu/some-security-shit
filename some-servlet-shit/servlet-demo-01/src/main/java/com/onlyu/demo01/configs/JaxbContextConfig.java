package com.onlyu.demo01.configs;

import com.onlyu.base.demo00.configs.JaxbContextClassesConfigurer;
import com.onlyu.demo01.dtos.reponses.Output;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class JaxbContextConfig implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContextListener.super.contextInitialized(sce);
        new JaxbContextClassesConfigurer().registerClasses(
                Output.class
        );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }

}

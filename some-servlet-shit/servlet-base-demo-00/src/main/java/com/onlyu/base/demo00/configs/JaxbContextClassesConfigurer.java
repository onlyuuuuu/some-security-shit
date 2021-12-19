package com.onlyu.base.demo00.configs;

public class JaxbContextClassesConfigurer {

    private JaxbContextClassesPublisher publisher;

    public JaxbContextClassesConfigurer() {
        this.publisher = new JaxbContextClassesPublisher();
    }

    public void registerClasses(Class... classes) {
        this.publisher.publish(classes);
    }
}

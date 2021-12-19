package com.onlyu.base.demo00.configs;

import com.onlyu.base.demo00.observable.Publisher;

public class JaxbContextClassesPublisher implements Publisher<Class[]> {

    @Override
    public void publish(Class[] data) {
        new JaxbContextClassesListener().onData(data);
    }

}

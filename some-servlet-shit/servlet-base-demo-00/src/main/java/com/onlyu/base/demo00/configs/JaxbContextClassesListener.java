package com.onlyu.base.demo00.configs;

import com.onlyu.base.demo00.factories.ProcessorFactory;
import com.onlyu.base.demo00.observable.Observer;
import com.onlyu.base.demo00.servlets.visitors.impl.JaxbContextModifier;

public class JaxbContextClassesListener implements Observer<Class[]> {

    @Override
    public void onData(Class[] data) {
        JaxbContextModifier jaxbContextModifier = new JaxbContextModifier(data);
        ProcessorFactory.getXmlApplicationProcessInstance().accept(jaxbContextModifier);
    }

}

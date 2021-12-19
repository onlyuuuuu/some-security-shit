package com.onlyu.base.demo00.servlets.visitors;

// marker interface
public interface ProcessorVisitorAcceptor<T extends ProcessorVisitor> {
    void accept(T visitor);
}

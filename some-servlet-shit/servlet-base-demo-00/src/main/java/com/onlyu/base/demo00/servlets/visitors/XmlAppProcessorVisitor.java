package com.onlyu.base.demo00.servlets.visitors;

import com.onlyu.base.demo00.servlets.impl.XmlAppProcessor;

public interface XmlAppProcessorVisitor extends ProcessorVisitor {
    void visit(XmlAppProcessor xmlAppProcessor);
}

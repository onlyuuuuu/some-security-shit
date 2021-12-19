package com.onlyu.base.demo00.servlets.visitors;

import com.onlyu.base.demo00.servlets.impl.JsonAppProcessor;

public interface JsonAppProcessorVisitor extends ProcessorVisitor {
    void visit(JsonAppProcessor jsonAppProcessor);
}

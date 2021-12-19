package com.onlyu.base.demo00.observable;

public interface Observer<T> {
    void onData(T data);
}

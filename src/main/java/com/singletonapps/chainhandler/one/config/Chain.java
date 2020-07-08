package com.singletonapps.chainhandler.one.config;

import com.singletonapps.chainhandler.one.handler.EmailFeederHandler;

public class Chain {

    private EmailFeederHandler handler;

    public Chain setNext(EmailFeederHandler nextHandler) {
        this.handler = nextHandler;
        return this;
    }

    public void onNext() {
        if (handler != null) {
            handler.handle();
        }
    }
}

package com.singletonapps.chainhandler.processor;

public abstract class EmailFeederProcessor {

    protected EmailFeederProcessor nextHandler;

    public abstract void process();

    public EmailFeederProcessor setNextHandler(EmailFeederProcessor nextHandler) {
        return this.nextHandler = nextHandler;
    }
}

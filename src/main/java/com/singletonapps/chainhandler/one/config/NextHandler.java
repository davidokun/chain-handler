package com.singletonapps.chainhandler.one.config;

import com.singletonapps.chainhandler.one.handler.EmailFeederHandler;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public abstract class NextHandler {

    protected EmailFeederHandler nextHandler;

    public EmailFeederHandler setNextHandler(EmailFeederHandler nextHandler) {
        this.nextHandler = nextHandler;
        return this.nextHandler;
    }
}

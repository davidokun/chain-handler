package com.singletonapps.chainhandler.one.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FirstHandler implements EmailFeederHandler {

    @Override
    public void handle() {
        log.info("Do Handler 1");
    }
}

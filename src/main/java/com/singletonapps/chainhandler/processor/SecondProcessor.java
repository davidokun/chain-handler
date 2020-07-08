package com.singletonapps.chainhandler.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SecondProcessor extends EmailFeederProcessor {

    @Override
    public void process() {
        log.info("Processor 2");

        if (nextHandler != null) {
            nextHandler.process();
        }
    }
}

package com.singletonapps.chainhandler.processor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FirstProcessor extends EmailFeederProcessor {

    @Override
    public void process() {
        log.info("Processor 1");

        if (nextHandler != null) {
            nextHandler.process();
        }
    }
}

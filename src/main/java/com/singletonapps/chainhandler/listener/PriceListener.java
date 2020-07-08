package com.singletonapps.chainhandler.listener;

import com.singletonapps.chainhandler.processor.FirstProcessor;
import com.singletonapps.chainhandler.processor.SecondProcessor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class PriceListener implements ChainProcessor {

    private final FirstProcessor firstProcessor;

    public void onMessage() {
        startChain();
    }

    @Override
    public void startChain() {
        firstProcessor.process();
    }

    @Override
    @PostConstruct
    public void initChain() {
        firstProcessor
                .setNextHandler(new SecondProcessor());
    }
}

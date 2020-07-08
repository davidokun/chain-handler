package com.singletonapps.chainhandler.one.listener;

import com.singletonapps.chainhandler.one.config.ChainConfigurer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@AllArgsConstructor
public class StateListener implements ConfigurableChain {

    private final ChainConfigurer chainConfigurer;

    public void onMessage() {
        log.info("Listening to state....");
        chainConfigurer.startChain();
    }

    @Override
    @PostConstruct
    public void configureChain() {
        chainConfigurer.getChain()
                .setNext(chainConfigurer.getSecondHandler())
                .setNext(chainConfigurer.getThirdHandler())
                .setNext(chainConfigurer.getFirstHandler());
    }
}

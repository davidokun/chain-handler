package com.singletonapps.chainhandler.one.listener;

import com.singletonapps.chainhandler.one.config.Chain;
import com.singletonapps.chainhandler.one.config.ChainConfigurer;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
@AllArgsConstructor
public class PriceListener implements ConfigurableChain {

    private final ChainConfigurer chainConfigurer;

    public void onMessage() {
        log.info("Listening to price....");
        chainConfigurer.startChain();
    }

    @Override
    @PostConstruct
    public void configureChain() {
        chainConfigurer.getChain()
                .setNext(chainConfigurer.getFirstHandler())
                .setNext(chainConfigurer.getSecondHandler())
                .setNext(chainConfigurer.getThirdHandler());
    }
}

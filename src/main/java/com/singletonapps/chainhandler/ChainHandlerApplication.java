package com.singletonapps.chainhandler;

import com.singletonapps.chainhandler.one.listener.PriceListener;
import com.singletonapps.chainhandler.one.listener.StateListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class ChainHandlerApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ChainHandlerApplication.class, args);
        PriceListener priceListener = (PriceListener) run.getBean("priceListener");
        StateListener stateListener = (StateListener) run.getBean("stateListener");
        priceListener.onMessage();
        stateListener.onMessage();
    }


}

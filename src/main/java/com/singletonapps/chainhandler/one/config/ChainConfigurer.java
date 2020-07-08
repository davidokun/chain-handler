package com.singletonapps.chainhandler.one.config;

import com.singletonapps.chainhandler.one.handler.FirstHandler;
import com.singletonapps.chainhandler.one.handler.SecondHandler;
import com.singletonapps.chainhandler.one.handler.ThirdHandler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Getter
@Component
@RequiredArgsConstructor
@Scope(SCOPE_PROTOTYPE)
public class ChainConfigurer {

    private final FirstHandler firstHandler;

    private final SecondHandler secondHandler;

    private final ThirdHandler thirdHandler;

    private Chain chain = new Chain();

    public void startChain() {
        chain.onNext();
    }


}

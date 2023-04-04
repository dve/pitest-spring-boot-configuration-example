package org.vergien.pitest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanFactory {

    @Bean("BEAN1")
    public ABean bean1() {
        return new ABean("bean1");
    }

    @Bean("BEAN2")
    public ABean bean2() {
        return new ABean("bean2");
    }

}
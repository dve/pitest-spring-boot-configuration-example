package org.vergien.pitest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class BeanFactoryTest {

    @Autowired
    private ApplicationContext applicationContext;


    @Test
    void testBean1(){
        ABean aBean = applicationContext.getBean("BEAN1", ABean.class);
        Assertions.assertNotNull(aBean);
        Assertions.assertEquals("bean1", aBean.getName());
    }

    @Test
    void testBean2(){
        ABean aBean = applicationContext.getBean("BEAN2", ABean.class);
        Assertions.assertNotNull(aBean);
        Assertions.assertEquals("bean2", aBean.getName());
    }
}
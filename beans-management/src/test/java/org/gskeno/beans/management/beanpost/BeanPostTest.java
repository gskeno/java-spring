package org.gskeno.beans.management.beanpost;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanPostTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        E bean = context.getBean(E.class);
//        System.out.println(bean);
    }
}

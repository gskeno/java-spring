package org.gskeno.beans.management.base;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeansManagementTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        C bean = context.getBean(C.class);
        System.out.println(bean);
    }
}

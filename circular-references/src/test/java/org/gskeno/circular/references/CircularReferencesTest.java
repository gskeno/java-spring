package org.gskeno.circular.references;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularReferencesTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        A bean = context.getBean(A.class);
        System.out.println(bean);
    }
}

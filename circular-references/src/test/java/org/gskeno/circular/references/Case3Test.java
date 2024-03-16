package org.gskeno.circular.references;


import org.gskeno.circular.references.case2.AppConfig2;
import org.gskeno.circular.references.case3.A3;
import org.gskeno.circular.references.case3.AppConfig3;
import org.gskeno.circular.references.case3.B3;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Case3Test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
        System.out.println("--------");
        A3 bean = context.getBean(A3.class);
        B3 b3 = context.getBean(B3.class);
        System.out.println(bean);
        System.out.println(b3);
    }
}

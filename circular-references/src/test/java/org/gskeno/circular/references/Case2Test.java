package org.gskeno.circular.references;


import org.gskeno.circular.references.case2.AppConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Case2Test {
    /**
     * A2 < ---- > B2，发生循环依赖，但不能都是通过构造函数注入的，否则无法解决
     */
    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig2.class);
//        A2 bean = context.getBean(A2.class);
//        System.out.println(bean);
    }
}

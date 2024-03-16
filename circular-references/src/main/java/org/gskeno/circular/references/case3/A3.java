package org.gskeno.circular.references.case3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class A3 {
    private B3 b3;

    @Autowired
    public A3(@Lazy B3 b3){
        this.b3 = b3;
        System.out.println("A3有参构造函数b3=" + b3.getClass());
    }
}

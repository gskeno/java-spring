package org.gskeno.beans.management.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class C {

    public C(){
        System.out.println("C 无参构造函数被执行");
    }

    @Autowired
    private D d;
}

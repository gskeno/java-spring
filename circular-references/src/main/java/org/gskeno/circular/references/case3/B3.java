package org.gskeno.circular.references.case3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B3 {

    @Autowired
    private A3 a3;

    public B3(){
        System.out.println("B3无参构造函数a3=" + a3);
    }
}

package org.gskeno.circular.references;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B {
    @Autowired
    private A a;


    public A getA() {
        return a;
    }
}

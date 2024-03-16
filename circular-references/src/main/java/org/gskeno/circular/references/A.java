package org.gskeno.circular.references;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {
    @Autowired
    private B b;

    public B getB() {
        return b;
    }
}

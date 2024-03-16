package org.gskeno.circular.references.case2;

import org.springframework.stereotype.Component;

@Component
public class A2 {
    private B2 b2;

    public A2(B2 b2){
        this.b2 = b2;
    }


}

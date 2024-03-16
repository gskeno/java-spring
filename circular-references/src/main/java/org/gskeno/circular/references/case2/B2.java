package org.gskeno.circular.references.case2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class B2 {
    // private A2 a2;

    @Autowired
    private A2 a2;
//
//    public B2(A2 a2){
//        this.a2 = a2;
//    }
}

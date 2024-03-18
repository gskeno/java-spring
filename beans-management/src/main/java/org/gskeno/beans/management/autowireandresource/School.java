package org.gskeno.beans.management.autowireandresource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
    // idea 推荐基于构造器方式注入
    @Autowired
    public School school;


}

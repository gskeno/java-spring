package org.gskeno.annotation.aop;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {
    private Logger LOG = LoggerFactory.getLogger(AopTest.class);
    @Test
    public void testAop(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        UserController userController = (UserController)context.getBean("userController");
        IUserService userService = userController.getiUserService();
        userService.showName();
    }
}

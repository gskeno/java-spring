package org.gskeno.annotation.aop;

import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public boolean showName() {
        System.out.println("UserService.showName");
        IUserService userService = (IUserService)AopContext.currentProxy();
        userService.showAge();
        //showAge();
        return false;
    }
    @Override
    public void showAge() {
        System.out.println("UserService.showAge");
    }
}

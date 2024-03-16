package org.gskeno.annotation.aop;

import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Override
    public boolean showName() {
        System.out.println("UserService.showName");
        showAge();
        return false;
    }
    @Override
    public void showAge() {
        System.out.println("UserService.showAge");
    }
}

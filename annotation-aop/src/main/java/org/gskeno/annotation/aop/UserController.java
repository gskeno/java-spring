package org.gskeno.annotation.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private IUserService iUserService;


    public IUserService getiUserService() {
        return iUserService;
    }
}

package com.study.controller;

import com.study.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController {
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        List<User> list = new ArrayList<User>();
        User u1 = new User();
        u1.setUsername("小红");
        u1.setAge(1);

        User u2 = new User();
        u2.setUsername("小李");
        u2.setAge(1);

        list.add(u1);
        list.add(u2);


        return new ModelAndView("userlist", "users", list);
    }
}

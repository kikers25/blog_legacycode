package com.blog.web;

import com.blog.domain.User;
import com.blog.service.Factory;
import com.blog.service.UserAdapter;
import com.blog.service.UserService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller  extends HttpServlet {


    protected static final String USER = "USER";

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {

        UserService userService = new UserService(new UserAdapter(), Factory.getUserConfigurationService());
        User user = userService.getUser(request.getParameter(USER));

        // Do something
    }

}

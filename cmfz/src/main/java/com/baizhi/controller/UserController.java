package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/8/28 0028.
 */

@Controller
@RequestMapping("/test")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public String queryAll(HttpSession session){
        List<User> users = userService.queryAll();
        session.setAttribute("users",users);
        return "index";
    }
    @RequestMapping("/save")
    @ResponseBody
    public void save(User user){
        //User user = new User(55, "laozhang", "123456");
        userService.save(user);

    }

}

package com.itheima.controller;

import com.itheima.pojo.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *
 * </p>
 *
 * @author: Eric
 * @since: 2020/11/19
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * dubbo 启动时创建的动态代理对象
     * <dubbo:reference interface=UserService类名></dubbo:reference>
     */
    @Autowired
    private UserService userService;

    @GetMapping("/findById")
    public User findById(int id){
        User user = userService.findById(id);
        return user;
    }
}

package com.dhy.cloud.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO --do sth
 *
 * @author Dong_hy
 * @date 2020/6/26 19:55.
 */
@RestController
@RequestMapping("/login")
public class UserController {

    @GetMapping("/test")
    public String getService() {
        return "login test";
    }


}

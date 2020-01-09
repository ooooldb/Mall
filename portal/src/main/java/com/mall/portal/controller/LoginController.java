package com.mall.portal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author: starc
 * @date: 2020/1/9
 */
@RestController
public class LoginController {

    @GetMapping("login")
    public ModelAndView login() {
        return new ModelAndView("login");
    }
}

package com.bms.controller;

import com.bms.common.result.Result;
import com.bms.service.IUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.IOException;

/**
 * Login Controller
 * @author Sn0w_15
 * @since 2024-07-24
 */
@RestController
public class LoginController {

    /*@Resource
    private RedisUtil redisUtil;*/

    @Resource
    private IUserService userService;



}

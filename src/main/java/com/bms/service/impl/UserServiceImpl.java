package com.bms.service.impl;

import com.bms.entity.User;
import com.bms.mapper.UserMapper;
import com.bms.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * User Account and Details Service Implementation Class
 * @author Sn0w_15
 * @since 2024-07-24
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}

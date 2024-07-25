package com.bms.mapper;

import com.bms.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * User Account and Details Mapper
 * @author Sn0w_15
 * @since 2024-07-24
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}

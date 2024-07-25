package com.bms.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * User Account and Details
 * </p>
 *
 * @author Sn0w_15
 * @since 2024-07-24
 */
@Getter
@Setter
@TableName("bms_user")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * User ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * Username
     */
    private String username;

    /**
     * First Name
     */
    private String firstName;

    /**
     * Last Name
     */
    private String lastName;

    /**
     * Password
     */
    private String password;

    /**
     * User Avatar Url
     */
    private String avatar;

    /**
     *  Email
     */
    private String email;

    /**
     * Mobile Number
     */
    private String phone;

    /**
     * Last Login Date
     */
    private LocalDateTime loginDate;

    /**
     * Account Status (0:Active, 1:Deactivate)
     */
    private String status;

    /**
     * Create Time
     */
    private LocalDateTime createTime;

    /**
     * Update Time
     */
    private LocalDateTime updateTime;

    /**
     * Remarks
     */
    private String remark;


}

package com.ailc.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统用户表
 *
 * @author jokershi 2020-12-04
 */
@Data
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 系统用户id
     */
    private Long userId;
    /**
     * 平台编码
     */
    private String appCode;
    /**
     * 部门id
     */
    private Integer deptId;
    /**
     * 用户类型 1.普通用户 2.系统管理员， 3.平台管理员
     */
    private int userType;
    /**
     * 登陆账号
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 盐
     */
    private String salt;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 0.无效 1.有效
     */
    private int status;
    /**
     * 创建人
     */
    private Integer createId;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;
}

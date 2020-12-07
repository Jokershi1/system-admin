package com.ailc.system.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 系统用户角色表
 *
 * @author jokershi 2020-12-04
 */
@Data
public class UserRole implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    private Long autoId;
    /**
     * 系统用户id
     */
    private Integer userId;
    /**
     * 系统角色id
     */
    private Integer roleId;
}

package com.ailc.system.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * 系统角色对应菜单表
 *
 * @author jokershi 2020-12-04
 */
@Data
public class RoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    private Long autoId;
    /**
     * 系统角色id
     */
    private Integer roleId;
    /**
     * 系统菜单id
     */
    private Integer menuId;
}


package com.ailc.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统菜单
 *
 * @author jokershi 2020-12-04
 */
@Data
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 系统菜单id
     */
    private Long menuId;
    /**
     * 菜单父级id
     */
    private Integer parentId;
    /**
     * 菜单编码
     */
    private String menuCode;
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单url
     */
    private String url;
    /**
     * 模块编码， 默认是：0， 用来多系统菜单
     */
    private int moduleCode;
    /**
     * 菜单类型  0：目录  1：菜单  2：按钮
     */
    private int menuType;
    /**
     * 菜单图标
     */
    private String icon;
    /**
     * 菜单排序
     */
    private Integer menuSort;
    /**
     * 菜单备注
     */
    private String remark;
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
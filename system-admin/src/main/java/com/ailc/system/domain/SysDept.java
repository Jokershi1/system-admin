package com.ailc.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统部门表
 *
 * @author jokershi 2020-12-04
 */
@Data
public class SysDept implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 系统部门id
     */
    private Long deptId;
    /**
     * 部门名称
     */
    private String deptName;
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


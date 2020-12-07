package com.ailc.system.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统平台表
 *
 * @author jokershi 2020-12-04
 */
@Data
public class SysApp implements Serializable {

    private static final long serialVersionUID = 1L;
    /**
     * 系统平台id，
     */
    private Long autoId;
    /**
     * 平台编码， c00000001
     */
    private String appCode;
    /**
     * 平台名称
     */
    private String appName;
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

package com.ailc.system.mapper;

import com.ailc.system.domain.SysApp;
import org.apache.ibatis.annotations.Param;

/**
 * 系统平台表
 *
 * @author jokershi
 * @date 2020/12/4 10:47
 */
public interface SysAppMapper {

    /**
     * 新增
     *
     * @param sysApp sysApp
     */
    void add(@Param("sysApp") SysApp sysApp);

    /**
     * 删除
     *
     * @param autoId autoId
     */
    void del(@Param("autoId") Long autoId);

    /**
     * 修改
     *
     * @param sysApp sysApp
     */
    void update(@Param("sysApp") SysApp sysApp);

    /**
     * 根据平台编码获取平台信息
     *
     * @param appCode appCode
     * @return SysApp
     */
    SysApp findByAppCode(@Param("appCode") String appCode);
}

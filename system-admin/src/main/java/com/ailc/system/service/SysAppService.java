package com.ailc.system.service;

import com.ailc.system.domain.SysApp;

/**
 * 系统平台
 *
 * @author jokershi
 * @date 2020/12/7 10:16
 */
public interface SysAppService {
    /**
     * 新增
     *
     * @param sysApp sysApp
     */
    void add(SysApp sysApp);

    /**
     * 删除
     *
     * @param autoId autoId
     */
    void del(Long autoId);

    /**
     * 修改
     *
     * @param sysApp sysApp
     */
    void update(SysApp sysApp);

    /**
     * 根据平台编码获取平台信息
     *
     * @param appCode appCode
     * @return SysApp
     */
    SysApp findByAppCode(String appCode);
}

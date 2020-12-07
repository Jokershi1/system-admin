package com.ailc.system.service;

import com.ailc.system.domain.SysUser;

/**
 * 系统用户
 *
 * @author jokershi
 * @date 2020/12/7 10:16
 */
public interface SysUserService {
    /**
     * 新增
     *
     * @param sysUser sysUser
     */
    void add(SysUser sysUser);

    /**
     * 删除
     *
     * @param userId userId
     */
    void del(Long userId);

    /**
     * 修改
     *
     * @param sysUser sysUser
     */
    void update(SysUser sysUser);
}

package com.ailc.system.service;

import com.ailc.system.domain.SysRole;

/**
 * 系统角色
 *
 * @author jokershi
 * @date 2020/12/7 10:16
 */
public interface SysRoleService {
    /**
     * 新增
     *
     * @param sysRole sysRole
     */
    void add(SysRole sysRole);

    /**
     * 删除
     *
     * @param roleId roleId
     */
    void del(Long roleId);

    /**
     * 修改
     *
     * @param sysRole sysRole
     */
    void update(SysRole sysRole);
}

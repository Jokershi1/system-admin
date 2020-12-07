package com.ailc.system.service;

import com.ailc.system.domain.SysMenu;

/**
 * 系统菜单
 *
 * @author jokershi
 * @date 2020/12/7 10:16
 */
public interface SysMenuService {

    /**
     * 新增
     *
     * @param sysMenu sysMenu
     */
    void add(SysMenu sysMenu);

    /**
     * 删除
     *
     * @param menuId menuId
     */
    void del(Long menuId);

    /**
     * 修改
     *
     * @param sysMenu sysMenu
     */
    void update(SysMenu sysMenu);

}

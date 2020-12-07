package com.ailc.system.mapper;

import com.ailc.system.domain.SysMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统菜单
 *
 * @author jokershi
 * @date 2020/12/4 10:47
 */
public interface SysMenuMapper {

    /**
     * 新增
     *
     * @param sysMenu sysMenu
     */
    void add(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 删除
     *
     * @param menuId menuId
     */
    void del(@Param("menuId") Long menuId);

    /**
     * 修改
     *
     * @param sysMenu sysMenu
     */
    void update(@Param("sysMenu") SysMenu sysMenu);

    /**
     * 根据主键id集合获取菜单信息
     *
     * @param menuIds menuIds
     * @return List<SysMenu>
     */
    List<SysMenu> findByMenuIds(@Param("menuIds") List<Long> menuIds);
}

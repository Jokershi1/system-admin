package com.ailc.system.mapper;

import com.ailc.system.domain.RoleMenu;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统角色对应菜单表
 *
 * @author jokershi
 * @date 2020/12/4 10:47
 */
public interface RoleMenuMapper {

    /**
     * 新增
     *
     * @param roleMenu roleMenu
     */
    void add(@Param("roleMenu") RoleMenu roleMenu);

    /**
     * 删除
     *
     * @param autoId autoId
     */
    void del(@Param("autoId") Long autoId);

    /**
     * 系统角色Id获取列表
     *
     * @param roleId roleId
     * @return return
     */
    List<RoleMenu> findByRoleId(@Param("roleId") Long roleId);
}

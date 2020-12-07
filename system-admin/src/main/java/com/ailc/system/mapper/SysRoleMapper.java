package com.ailc.system.mapper;

import com.ailc.system.domain.SysRole;
import org.apache.ibatis.annotations.Param;

/**
 * 系统角色表
 *
 * @author jokershi
 * @date 2020/12/4 10:48
 */
public interface SysRoleMapper {

    /**
     * 新增
     *
     * @param sysRole sysRole
     */
    void add(@Param("sysRole") SysRole sysRole);

    /**
     * 删除
     *
     * @param roleId roleId
     */
    void del(@Param("roleId") Long roleId);

    /**
     * 修改
     *
     * @param sysRole sysRole
     */
    void update(@Param("sysRole") SysRole sysRole);

    /**
     * 根据主键获取系统角色
     *
     * @param roleId roleId
     * @return SysRole
     */
    SysRole findOne(@Param("roleId") Long roleId);
}

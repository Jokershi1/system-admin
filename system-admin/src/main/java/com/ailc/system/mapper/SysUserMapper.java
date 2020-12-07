package com.ailc.system.mapper;

import com.ailc.system.domain.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统用户表
 *
 * @author jokershi
 * @date 2020/12/4 10:48
 */
public interface SysUserMapper {
    /**
     * 新增
     *
     * @param sysUser
     */
    void add(@Param("sysUser") SysUser sysUser);

    /**
     * 删除
     *
     * @param userId
     */
    void del(@Param("userId") Long userId);

    /**
     * 修改
     *
     * @param sysUser
     */
    void update(@Param("sysUser") SysUser sysUser);

    /**
     * 根据主键获取系统用户
     *
     * @param userId userId
     * @return SysUser
     */
    SysUser findOne(@Param("userId") Long userId);

    /**
     * 根据平台id获取用户信息
     *
     * @param appCode appCode
     * @return List<SysUser>
     */
    List<SysUser> findByAppCode(@Param("appCode") Long appCode);

    /**
     * 根据部门id获取用户信息
     *
     * @param deptId deptId
     * @return List<SysUser>
     */
    List<SysUser> findByDeptId(@Param("deptId") Long deptId);
}

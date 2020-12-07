package com.ailc.system.mapper;

import com.ailc.system.domain.UserRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 系统用户角色表
 *
 * @author jokershi
 * @date 2020/12/4 10:48
 */
public interface UserRoleMapper {
    /**
     * 新增
     *
     * @param userRole userRole
     */
    void add(@Param("userRole") UserRole userRole);

    /**
     * 删除
     *
     * @param autoId autoId
     */
    void del(@Param("autoId") Long autoId);

    /**
     * 根据用户id获取角色
     *
     * @param userId userId
     * @return List<UserRole>
     */
    List<UserRole> findByUserId(@Param("userId") Long userId);
}

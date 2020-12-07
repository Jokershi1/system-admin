package com.ailc.system.mapper;

import com.ailc.system.domain.SysDept;
import org.apache.ibatis.annotations.Param;

/**
 * 系统部门表
 *
 * @author jokershi
 * @date 2020/12/4 10:47
 */
public interface SysDeptMapper {

    /**
     * 新增
     *
     * @param sysDept sysDept
     */
    void add(@Param("sysDept") SysDept sysDept);

    /**
     * 删除
     *
     * @param deptId deptId
     */
    void del(@Param("deptId") Long deptId);

    /**
     * 修改
     *
     * @param sysDept sysDept
     */
    void update(@Param("sysDept") SysDept sysDept);

    /**
     * 根据主键获取部门信息
     *
     * @param deptId
     * @return
     */
    SysDept findOne(@Param("deptId") Long deptId);
}

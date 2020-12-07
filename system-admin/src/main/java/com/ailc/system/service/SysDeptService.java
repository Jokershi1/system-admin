package com.ailc.system.service;

import com.ailc.system.domain.SysDept;

/**
 * 系统部门
 *
 * @author jokershi
 * @date 2020/12/7 10:16
 */
public interface SysDeptService {

    /**
     * 新增
     *
     * @param sysDept sysDept
     */
    void add(SysDept sysDept);

    /**
     * 删除
     *
     * @param autoId autoId
     */
    void del(Long autoId);

    /**
     * 修改
     *
     * @param sysDept sysDept
     */
    void update(SysDept sysDept);
}

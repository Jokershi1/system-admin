package com.ailc.system.service.impl;

import com.ailc.system.domain.SysRole;
import com.ailc.system.mapper.SysRoleMapper;
import com.ailc.system.service.SysRoleService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统角色
 *
 * @author jokershi
 * @date 2020/12/7 10:57
 */
@Slf4j
@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public void add(SysRole sysRole) {
        try {
            if (StringUtils.isBlank(sysRole.getRoleName())) {
                log.info("角色名称不能为空");
                return;
            }
            sysRoleMapper.add(sysRole);
        } catch (Exception e) {
            log.error("add e: sysRole=>{}", e, sysRole);
        }
    }

    @Override
    public void del(Long roleId) {
        try {
            if (null == roleId) {
                log.info("autoId iss null");
                return;
            }
            sysRoleMapper.del(roleId);
        } catch (Exception e) {
            log.error("del e: roleId=>{}", e, roleId);
        }
    }

    @Override
    public void update(SysRole sysRole) {
        try {
            sysRoleMapper.update(sysRole);
        } catch (Exception e) {
            log.error("del e: sysRole=>{}", e, sysRole);
        }
    }
}

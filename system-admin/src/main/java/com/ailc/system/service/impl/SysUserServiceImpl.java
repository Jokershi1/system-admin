package com.ailc.system.service.impl;

import com.ailc.system.domain.SysUser;
import com.ailc.system.mapper.SysUserMapper;
import com.ailc.system.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统用户
 *
 * @author jokershi
 * @date 2020/12/7 10:57
 */
@Slf4j
@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public void add(SysUser sysUser) {
        try {
            //平台编码
            String appCode = sysUser.getAppCode();
            //部门id
            Integer deptId = sysUser.getDeptId();
            //登录账号
            String username = sysUser.getUsername();
            //密码
            String password = sysUser.getPassword();
            //盐
            String salt = sysUser.getSalt();
            //姓名
            String name = sysUser.getName();
            if (StringUtils.isBlank(appCode) || null == deptId || StringUtils.isBlank(username) ||
                    StringUtils.isBlank(password) || StringUtils.isBlank(salt) || StringUtils.isBlank(name)) {
                log.info("参数非法 appCode={}, deptId={}, username={}, password={}, salt={}, name={}", appCode,
                        deptId, username, password, salt, name);
                return;
            }
            sysUserMapper.add(sysUser);
        } catch (Exception e) {
            log.error("add e: sysUser={}", e, sysUser);
        }
    }

    @Override
    public void del(Long userId) {
        try {
            if(null == userId){
                log.info("userId is null");
                return;
            }
            sysUserMapper.del(userId);
        } catch (Exception e) {
            log.error("del e: userId={}", e, userId);
        }

    }

    @Override
    public void update(SysUser sysUser) {
        try {
            sysUserMapper.update(sysUser);
        } catch (Exception e) {
            log.error("update: sysUser={}", e, sysUser);
        }

    }
}

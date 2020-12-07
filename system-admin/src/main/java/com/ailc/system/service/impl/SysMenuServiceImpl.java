package com.ailc.system.service.impl;

import com.ailc.system.domain.SysMenu;
import com.ailc.system.mapper.SysMenuMapper;
import com.ailc.system.service.SysMenuService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统菜单
 *
 * @author jokershi
 * @date 2020/12/7 10:57
 */
@Slf4j
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Resource
    private SysMenuMapper sysMenuMapper;

    @Override
    public void add(SysMenu sysMenu) {
        try {
            //菜单编码
            String menuCode = sysMenu.getMenuCode();
            //菜单名称
            String menuName = sysMenu.getMenuName();
            if (StringUtils.isBlank(menuCode) || StringUtils.isBlank(menuName)) {
                log.info("添加系统菜单参数非法，menuCode={},menuName={}", menuCode, menuName);
                return;
            }
            sysMenuMapper.add(sysMenu);
        } catch (Exception e) {
            log.error("add e: sysMenu=>{}", e, sysMenu);
        }
    }

    @Override
    public void del(Long menuId) {
        try {
            if (null == menuId) {
                log.info("menuId iss null");
                return;
            }
            sysMenuMapper.del(menuId);
        } catch (Exception e) {
            log.error("del e: menuId=>{}", e, menuId);
        }
    }

    @Override
    public void update(SysMenu sysMenu) {
        try {
            sysMenuMapper.update(sysMenu);
        } catch (Exception e) {
            log.error("update e: sysMenu=>{}", e, sysMenu);
        }
    }
}

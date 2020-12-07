package com.ailc.system.service.impl;

import com.ailc.system.domain.SysApp;
import com.ailc.system.mapper.SysAppMapper;
import com.ailc.system.service.SysAppService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统平台
 *
 * @author jokershi
 * @date 2020/12/7 10:57
 */
@Slf4j
@Service
public class SysAppServiceImpl implements SysAppService {

    @Resource
    private SysAppMapper sysAppMapper;

    @Override
    public void add(SysApp sysApp) {
        try {
            //平台名称
            String appName = sysApp.getAppName();
            if (StringUtils.isBlank(appName)) {
                log.info("appName is null");
                return;
            }
            //新增
            sysAppMapper.add(sysApp);
        } catch (Exception e) {
            log.error("add e: sysApp=>{}", e, sysApp);
        }
    }

    @Override
    public void del(Long autoId) {
        try {
            if (null == autoId) {
                log.info("autoId is null");
                return;
            }
            //删除
            sysAppMapper.del(autoId);
        } catch (Exception e) {
            log.error("del e: autoId=>{}", e, autoId);
        }
    }

    @Override
    public void update(SysApp sysApp) {
        try {
            sysAppMapper.update(sysApp);
        } catch (Exception e) {
            log.error("update e: sysApp=>{}", e, sysApp);
        }
    }

    @Override
    public SysApp findByAppCode(String appCode) {
        try {
            if (StringUtils.isBlank(appCode)) {
                log.info("appCode is null");
                return null;
            }
            //根据平台编码获取平台信息
            return sysAppMapper.findByAppCode(appCode);
        } catch (Exception e) {
            log.error("findByAppCode e: appCode=>{}", e, appCode);
        }
        return null;
    }
}

package com.ailc.system.service.impl;

import com.ailc.system.domain.SysDept;
import com.ailc.system.mapper.SysDeptMapper;
import com.ailc.system.service.SysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 系统部门
 *
 * @author jokershi
 * @date 2020/12/7 10:57
 */
@Slf4j
@Service
public class SysDeptServiceImpl implements SysDeptService {
    @Resource
    private SysDeptMapper sysDeptMapper;

    @Override
    public void add(SysDept sysDept) {
        try {
            if(StringUtils.isBlank(sysDept.getDeptName())){
                log.info("deptName iss null");
                return;
            }
            sysDeptMapper.add(sysDept);
        } catch (Exception e) {
            log.error("add e: sysDept=>{}", e, sysDept);
        }
    }

    @Override
    public void del(Long autoId) {
        try {
            if(null == autoId){
                log.info("autoId iss null");
                return;
            }
            sysDeptMapper.del(autoId);
        } catch (Exception e) {
            log.error("del e: autoId=>{}", e, autoId);
        }
    }

    @Override
    public void update(SysDept sysDept) {
        try {
            sysDeptMapper.update(sysDept);
        } catch (Exception e) {
            log.error("update e: sysDept=>{}", e, sysDept);
        }
    }
}

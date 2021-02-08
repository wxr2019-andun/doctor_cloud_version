package com.doctor.info_module.service.impl;

import com.doctor.info_module.entity.Manager;
import com.doctor.info_module.mapper.ManagerMapper;
import com.doctor.info_module.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 * GET-version:
 * Date:2021-01-29  10:43
 * Author: wxr
 */
@Service("managerService")
public class ManagerServiceImpl implements ManagerService {
    @Autowired(required = false)
    private ManagerMapper managerMapper;

    @Override
    public Manager queryManagerData(Integer managerId) {
        return managerMapper.selectByPrimaryKey(managerId);
    }
}

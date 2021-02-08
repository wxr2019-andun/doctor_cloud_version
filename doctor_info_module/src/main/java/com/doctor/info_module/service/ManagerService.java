package com.doctor.info_module.service;

import com.doctor.info_module.entity.Manager;

/**
 * Description:
 * GET-version:
 * Date:2021-01-29  10:43
 * Author: wxr
 */

public interface ManagerService {
    Manager queryManagerData(Integer managerId);
}

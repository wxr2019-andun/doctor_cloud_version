package com.doctor.info_module.controller;

import com.doctor.info_module.entity.Manager;
import com.doctor.info_module.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 * GET-version:
 * Date:2021-01-29  10:45
 * Author: wxr
 */
@RestController
@RequestMapping("infoTest")
public class InfoTestController {
    @Autowired
    @Qualifier("managerService")
    private ManagerService managerService;

    @GetMapping("queryManagerData/{managerId}")
    Manager queryManagerData(@PathVariable("managerId") Integer managerId){
        return  managerService.queryManagerData(managerId);
    }
}

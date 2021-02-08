package com.doctor.function_module.controller;

import com.doctor.function_module.Bean.ManagerVo;
import com.doctor.function_module.entity.DoctorUserRelationship;
import com.doctor.function_module.service.AttentionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Description:
 * GET-version:
 * Date:2021-01-29  15:13
 * Author: wxr
 */
@RestController
@RequestMapping("doctorFunction")
public class FunctionController {
    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Resource
    AttentionService attentionService;

    @GetMapping("getAttentionData/{managerId}")
    public List<DoctorUserRelationship> getAttentionData(@PathVariable("managerId") Integer managerId){
        List<DoctorUserRelationship> doctorUserRelationshipList = attentionService.attentionData(managerId);
        return doctorUserRelationshipList;
    }

    @GetMapping("user/{managerId}")
    public ManagerVo getDI_ManagerInfo(@PathVariable("managerId") Integer managerId){
        String url= "http://info-module/infoTest/queryManagerData/"+managerId;
        return restTemplate.getForObject(url,ManagerVo.class);
    }



}

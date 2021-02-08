package com.doctor.function_module.service.impl;


import com.doctor.function_module.entity.DoctorUserRelationship;
import com.doctor.function_module.mapper.DoctorUserRelationshipMapper;
import com.doctor.function_module.service.AttentionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


/**
 * Description:
 * GET-version:
 * Date:2021-01-28  14:36
 * Author: wxr
 */
@Service
public class AttentionServiceImpl implements AttentionService {
    @Resource
    DoctorUserRelationshipMapper doctorUserRelationshipMapper;

    @Override
    public  List<DoctorUserRelationship> attentionData(Integer managerId) {
        DoctorUserRelationship doctorUserRelationship = new DoctorUserRelationship();
        doctorUserRelationship.setManagerId(managerId);
        List<DoctorUserRelationship> doctorUserRelationshipList = doctorUserRelationshipMapper.select(doctorUserRelationship);
        return doctorUserRelationshipList;
    }
}

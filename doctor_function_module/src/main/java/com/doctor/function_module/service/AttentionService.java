package com.doctor.function_module.service;

import com.doctor.function_module.entity.DoctorUserRelationship;

import java.util.List;



/**
 * Description:
 * GET-version:
 * Date:2021-01-28  14:36
 * Author: wxr
 */

public interface AttentionService {
    List<DoctorUserRelationship> attentionData(Integer managerId);
}

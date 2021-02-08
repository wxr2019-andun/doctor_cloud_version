package com.doctor.function_module.entity;

import lombok.Data;

import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name="a_sys_doctor_user_relationship")
@Data
public class DoctorUserRelationship implements Serializable {
    /**
     * id
     */
    private Integer id;

    /**
     * 医生id
     */
    private Integer managerId;

    /**
     * 佩戴人id
     */
    private String wearUserId;

    /**
     * 创建时间
     */
    private Date gmtCreate;

    /**
     * 更新时间
     */
    private Date gmtUpdate;

    private static final long serialVersionUID = 1L;


}
package com.doctor.function_module.Bean;


import lombok.Data;


/**
 * @Description:
 * @ Data 15:56 2020/7/27
 * @ GET-Version:
 * @ Author: wxr
 */
@Data
public class ManagerVo {

    private static final long serialVersionUID = -3467360899069048896L;
    /**
     * 自增ID
     */
    private Integer managerId;
    /**
     * 账号
     */
    private String account;
    /**
     * 密码
     */
    private String password;
    /**
     * 角色
     */
    private Byte roleId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证
     */
    private String idCard;
    /**
     * 验证凭证
     */
    private String credential;
    /**
     * 是否认证，  0是未认证， 1是认证 , 2是认证中', （如果是3 改成2）
     */
    private Integer status;
    /**
     * 是否启用 0=禁用 1=启用
     */
    private Boolean locked;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 电话
     */
    private String phone;
    /**
     * 性别
     */
    private Boolean sex;
    /**
     * 类型
     */
    private String type;
    /**
     * 专业擅长
     */
    private String majors;
    /**
     * 职业经历
     */
    private String career;
    /**
     * 职称
     */
    private String positions;
    /**
     * 等级
     */
    private Integer grade;
    /**
     * 科室
     */
    private String departments;
    /**
     * 医院
     */
    private String hospitals;
    /**
     * 身份证
     */
    private String idCardCertificates;
    /**
     * 身份证（人像面）
     */
    private String idCardFaceImage;
    /**
     * 身份证（国徽面）
     */
    private String idCardNationalEmblem;
    /**
     * 工作证
     */
    private String jobCertificates;
    /**
     * 执业证
     */
    private String careerCertificates;
    /**
     * 执业证（照片页）
     */
    private String careerCertificatesPicture;
    /**
     * 医生资格证（照片页）
     */
    private String doctorQualificationPicture;
    /**
     * 医生资格证（信息页）
     */
    private String doctorQualificationMessage;
    /**
     * 头像
     */
    private String photo;
    /**
     * 登陆IP
     */
    private String lastLoginIp;
    /**
     * 手机型号
     */
    private String model;
    /**
     * App版本号
     */
    private String version;
    //经度
    private Double lon;
    //纬度
    private Double lat;
}
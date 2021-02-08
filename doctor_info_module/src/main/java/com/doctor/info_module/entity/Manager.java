package com.doctor.info_module.entity;


import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


/**
 * @Description:
 * @ Data 15:56 2020/7/27
 * @ GET-Version:
 * @ Author: wxr
 */
@Data
@Table(name="a_sys_manager")
public class Manager {

    private static final long serialVersionUID = -3467360899069048896L;
    @Id
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
    //数据创建时间
//    @TableField(value = "gmt_create",jdbcType = JdbcType.TIMESTAMP)
    private Date gmtCreate;
    //数据修改时间
//    @TableField(value = "gmt_modified",jdbcType = JdbcType.TIMESTAMP)
    private Date gmtModified;
    //省ID
    private String provinceId;
    /**
     * 省名
     */
    private String provinceName;
    //省ID
    private String cityId;
    /**
     * 市名
     */
    private String cityName;
    //省ID
    private String areaId;
    /**
     * 县名
     */
    private String areaName;
    //省ID
    private String address;
    /**
     * 推荐人
     */
    private String recommender;
    //医院ID
    private Integer hospitalId;
    //'审核成功提示提示状态码 1:审核通过未发送提示 2:已发送提示;',
    private Integer reviewResultStatus;
    //标签  0：未通过 1：西医 2：中医 3：营养师 4：合伙人',
    private Integer tag;
    /**
     * 修改基本信息失败原因
     */
    private String baseInfoSetCauseOfFailure;
    // 1=修改基本信息审核中 2=修改基本信息成功 3=修改基本信息失败 4=前端展示过一次修改失败原因,此人曾经修改,客服判定失败',
    private Integer amendBaseInfoSign;
    //审核身份修改失败原因
    private String causeOfFailure;
    /**
     * 邀请码
     */
    private String invitationCode;

    /**
     * 邀请码图片地址
     */
    private String invitationCodeQrImg;

}
package com.vivi.common.to;

import lombok.Data;

import java.util.Date;

/**
 * @author wangwei
 * 2021/1/14 20:46
 *
 * 返回给前端的用户数据模型
 */
@Data
public class MemberInfoTO {

    /**
     * id
     */
    private Long id;
    /**
     * 会员等级id
     */
    // private Long levelId;
    // 会员等级名
    private String level;
    /**
     * 用户名
     */
    private String username;

    /**
     * 昵称
     */
    private String nickname;
    /**
     * 手机号码
     */
    private String mobile;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 头像
     */
    private String header;
    /**
     * 性别
     */
    private Integer gender;
    /**
     * 生日
     */
    private Date birth;
    /**
     * 所在城市
     */
    private String city;
    /**
     * 职业
     */
    private String job;
    /**
     * 个性签名
     */
    private String sign;
    /**
     * 用户来源
     */
    private Integer sourceType;
    /**
     * 积分
     */
    private Integer integration;
    /**
     * 成长值
     */
    private Integer growth;
    /**
     * 启用状态
     */
    private Integer status;
    /**
     * 注册时间
     */
    private Date createTime;
}

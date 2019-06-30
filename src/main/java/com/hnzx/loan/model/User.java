package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: User
 * FileName：User.java
 * Description：用户实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/22			    create
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = -3960510558361475814L;

    /**
     * 用户主键
     */
    private Long uid;

    /**
     * 用户姓名
     */
    @NotEmpty(message = "用户名不能为空")
    @Length(min = 3, max = 30, message = "用户名长度必须位于${min}到${max}之间")
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像
     */
    private String avatar;

    /**
     * 用户性别
     */
    private String gender;

    /**
     * 用户年龄
     */
    private Integer age;

    /**
     * 身份证号码
     */
    private String idCard;

    /**
     * 用户祖籍
     */
    private String ancestralHome;

    /**
     * 用户现居住地
     */
    private String currentResidence;

    /**
     * 用户家庭成员个数
     */
    private Integer familyPopulation;

    /**
     * 用户备注
     */
    private String remark;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}

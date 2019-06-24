package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: Material
 * FileName：Material.java
 * Description：资料实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/24			    create
 */
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Material implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -2941691963811071162L;

    /**
     * 资料主键
     */
    private Long mtId;

    /**
     * 上传用户
     */
    private Long uid;

    /**
     * 资料类型
     */
    private Integer type;

    /**
     * 资料名称
     */
    private String name;

    /**
     * 资料路径
     */
    private String url;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时
     */
    private Date updateTime;
}

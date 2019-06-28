package com.hnzx.loan.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: UploadFile
 * FileName：UploadFile.java
 * Description：上传文件实体类
 * History：
 * 版本号 			作者 			日期       				简介
 * 	1.0				ccy		        2019/6/28			    create
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UploadFile implements Serializable {

    /**
     * 声明序列化
     */
    private static final long serialVersionUID = -6883455987998841872L;

    /**
     * 文件主键
     */
    private Long fileId;

    /**
     * 文件名称
     */
    private String fileName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 文件数据
     */
    private byte[] fileData;

    /**
     * 是否有效
     */
    private Integer isValid;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}

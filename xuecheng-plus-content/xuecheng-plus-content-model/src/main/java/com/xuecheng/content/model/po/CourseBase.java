package com.xuecheng.content.model.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: qhy
 * @date: 2024-03-02 14:19
 */
@Data
public class CourseBase implements Serializable {

    public static final long serialVersionUID = 1L;

    private Long id;

    private Long companyId;
    private String companyName;
    private String courseName;
    private String users;
    private String tags;
    private String mc;
    private String sc;
    private String grade;
    private String teachMode;
    private String description;
    private String picture;
    private Date createTime;
    private Date updateTime;
    private String createPeople;
    private String updatePeople;
    private String auditStatus;
    private Integer status;

}

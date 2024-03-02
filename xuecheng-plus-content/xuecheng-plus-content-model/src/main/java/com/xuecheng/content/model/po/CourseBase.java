package com.xuecheng.content.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: qhy
 * @date: 2024-03-02 14:19
 */
@Data
@TableName(value = "course_base")
public class CourseBase implements Serializable {

    public static final long serialVersionUID = 1L;

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    @TableField(value = "company_id")
    private Long companyId;
    @TableField(value = "company_name")
    private String companyName;
    @TableField(value = "course_name")
    private String courseName;
    @TableField(value = "users")
    private String users;
    @TableField(value = "tags")
    private String tags;
    @TableField(value = "mc")
    private String mc;
    @TableField(value = "sc")
    private String sc;
    @TableField(value = "grade")
    private String grade;
    @TableField(value = "teach_mode")
    private String teachMode;
    @TableField(value = "description")
    private String description;
    @TableField(value = "picture")
    private String picture;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "update_time")
    private Date updateTime;
    @TableField(value = "create_people")
    private String createPeople;
    @TableField(value = "update_people")
    private String updatePeople;
    @TableField(value = "audit_status")
    private String auditStatus;
    @TableField(value = "status")
    private Integer status;

}

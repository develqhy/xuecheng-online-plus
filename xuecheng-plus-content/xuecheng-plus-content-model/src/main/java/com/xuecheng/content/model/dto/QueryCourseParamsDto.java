package com.xuecheng.content.model.dto;

import lombok.Data;

/**
 * @author: qhy
 * @date: 2024-03-02 15:02
 * @description: 按条件查询课程的模型类
 */
@Data
public class QueryCourseParamsDto {

    // 审核状态
    private String auditStatus;
    // 课程名称
    private String courseName;
    // 发布状态
    private String publishStatus;

}

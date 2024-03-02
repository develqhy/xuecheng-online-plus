package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: qhy
 * @date: 2024-03-02 14:54
 * @description: 分页查询条件
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageParams {

    // 当前页码
    private Long pageNum=1L;
    // 每页显示记录数
    private Long pageSize=10L;

}

package com.xuecheng.base.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @author: qhy
 * @date: 2024-03-02 15:09
 * @description: 分页查询结果
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> implements Serializable {

    // 数据列表
    private List<T> items;
    // 总记录数
    private long total;
    // 当前页码
    private long currentPage;
    // 每页的记录数
    private long pageSize;

}

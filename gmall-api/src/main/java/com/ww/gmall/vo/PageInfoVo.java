package com.ww.gmall.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class PageInfoVo implements Serializable {
    @ApiModelProperty("总记录数")
    private Long total;
    @ApiModelProperty("总页码")
    private Long totalPage;
    @ApiModelProperty("每页显示的记录数")
    private Long pageSize;
    @ApiModelProperty("分页查出的数据")
    private List<? extends Object> list;
    @ApiModelProperty("当前页的页码")
    private Long pageNum;

    public PageInfoVo(Long total, Long totalPage, Long pageSize, List<? extends Object> list, Long pageNum) {
        this.total = total;
        this.totalPage = totalPage;
        this.pageSize = pageSize;
        this.list = list;
        this.pageNum = pageNum;
    }
}

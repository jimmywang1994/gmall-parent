package com.ww.gmall.pms.service;

import com.ww.gmall.pms.vo.PmsProductQueryParam;
import com.ww.gmall.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.ww.gmall.vo.PageInfoVo;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
public interface ProductService extends IService<Product> {

    /**
     * 根据复杂查询条件返回分页数据
     * @param productQueryParam
     * @return
     */
    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}

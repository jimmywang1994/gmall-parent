package com.ww.gmall.pms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.pms.vo.PmsProductQueryParam;
import com.ww.gmall.pms.entity.Product;
import com.ww.gmall.pms.mapper.ProductMapper;
import com.ww.gmall.pms.service.ProductService;
import com.ww.gmall.vo.PageInfoVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam) {
        QueryWrapper wrapper = new QueryWrapper();
        IPage<Product> productPage = productMapper.selectPage(new Page<Product>(productQueryParam.getPageNum(), productQueryParam.getPageSize()), null);
        PageInfoVo pageInfoVo = new PageInfoVo(productPage.getTotal(), productPage.getPages(), productPage.getSize(), productPage.getRecords(), productPage.getCurrent());
        return pageInfoVo;
    }
}

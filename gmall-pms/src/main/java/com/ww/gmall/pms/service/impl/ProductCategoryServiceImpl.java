package com.ww.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.pms.entity.ProductCategory;
import com.ww.gmall.pms.mapper.ProductCategoryMapper;
import com.ww.gmall.pms.service.ProductCategoryService;
import com.ww.gmall.pms.vo.PmsProductCategoryWithChildrenItem;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Component
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Override
    public List<PmsProductCategoryWithChildrenItem> listCatalogWithChildren(Integer i) {
        List<PmsProductCategoryWithChildrenItem> item=productCategoryMapper.listCatalogWithChildren(i);
        return item;
    }
}

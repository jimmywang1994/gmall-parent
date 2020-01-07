package com.ww.gmall.pms.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ww.gmall.constant.SystemCacheConstant;
import com.ww.gmall.pms.entity.ProductCategory;
import com.ww.gmall.pms.mapper.ProductCategoryMapper;
import com.ww.gmall.pms.service.ProductCategoryService;
import com.ww.gmall.pms.vo.PmsProductCategoryWithChildrenItem;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
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
@Slf4j
@Component
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {

    @Autowired
    ProductCategoryMapper productCategoryMapper;
    @Autowired
    RedisTemplate<Object, Object> redisTemplate;

    @Override
    public List<PmsProductCategoryWithChildrenItem> listCatalogWithChildren(Integer i) {
        List<PmsProductCategoryWithChildrenItem> items;
        Object cachedMenu =redisTemplate.opsForValue().get(SystemCacheConstant.CATEGORY_CACHED_KEY);
        if(cachedMenu!=null) {
            items=(List<PmsProductCategoryWithChildrenItem>)cachedMenu;
            log.info("菜单数据命中缓存");
        }else{
            items = productCategoryMapper.listCatalogWithChildren(i);
            redisTemplate.opsForValue().set(SystemCacheConstant.CATEGORY_CACHED_KEY, items);
        }
        return items;
    }
}

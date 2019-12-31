package com.ww.gmall.pms.service.impl;

import com.ww.gmall.pms.entity.Product;
import com.ww.gmall.pms.mapper.ProductMapper;
import com.ww.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}

package com.ww.gmall.pms.service.impl;

import com.ww.gmall.pms.entity.ProductFullReduction;
import com.ww.gmall.pms.mapper.ProductFullReductionMapper;
import com.ww.gmall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2020-01-06
 */
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}

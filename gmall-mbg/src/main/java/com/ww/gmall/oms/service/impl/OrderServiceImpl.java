package com.ww.gmall.oms.service.impl;

import com.ww.gmall.oms.entity.Order;
import com.ww.gmall.oms.mapper.OrderMapper;
import com.ww.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author wwei
 * @since 2019-12-31
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}

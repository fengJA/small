package com.fj.small.oms.service.impl;

import com.fj.small.oms.entity.Order;
import com.fj.small.oms.mapper.OrderMapper;
import com.fj.small.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}

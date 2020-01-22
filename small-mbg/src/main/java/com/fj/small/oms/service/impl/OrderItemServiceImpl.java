package com.fj.small.oms.service.impl;

import com.fj.small.oms.entity.OrderItem;
import com.fj.small.oms.mapper.OrderItemMapper;
import com.fj.small.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}

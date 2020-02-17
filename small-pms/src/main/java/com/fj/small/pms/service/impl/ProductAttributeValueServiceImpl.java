package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.ProductAttributeValue;
import com.fj.small.pms.mapper.ProductAttributeValueMapper;
import com.fj.small.pms.service.ProductAttributeValueService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}

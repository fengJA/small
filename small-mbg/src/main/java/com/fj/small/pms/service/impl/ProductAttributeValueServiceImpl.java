package com.fj.small.pms.service.impl;

import com.fj.small.pms.entity.ProductAttributeValue;
import com.fj.small.pms.mapper.ProductAttributeValueMapper;
import com.fj.small.pms.service.ProductAttributeValueService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 存储产品参数信息的表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-02-17
 */
@Service
public class ProductAttributeValueServiceImpl extends ServiceImpl<ProductAttributeValueMapper, ProductAttributeValue> implements ProductAttributeValueService {

}

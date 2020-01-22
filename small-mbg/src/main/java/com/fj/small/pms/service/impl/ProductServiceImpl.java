package com.fj.small.pms.service.impl;

import com.fj.small.pms.entity.Product;
import com.fj.small.pms.mapper.ProductMapper;
import com.fj.small.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}

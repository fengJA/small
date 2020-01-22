package com.fj.small.pms.service.impl;

import com.fj.small.pms.entity.ProductLadder;
import com.fj.small.pms.mapper.ProductLadderMapper;
import com.fj.small.pms.service.ProductLadderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品阶梯价格表(只针对同商品) 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class ProductLadderServiceImpl extends ServiceImpl<ProductLadderMapper, ProductLadder> implements ProductLadderService {

}

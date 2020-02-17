package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.ProductVertifyRecord;
import com.fj.small.pms.mapper.ProductVertifyRecordMapper;
import com.fj.small.pms.service.ProductVertifyRecordService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品审核记录 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class ProductVertifyRecordServiceImpl extends ServiceImpl<ProductVertifyRecordMapper, ProductVertifyRecord> implements ProductVertifyRecordService {

}

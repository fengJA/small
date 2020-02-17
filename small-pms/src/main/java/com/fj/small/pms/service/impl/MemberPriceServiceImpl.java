package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.MemberPrice;
import com.fj.small.pms.mapper.MemberPriceMapper;
import com.fj.small.pms.service.MemberPriceService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品会员价格表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceMapper, MemberPrice> implements MemberPriceService {

}

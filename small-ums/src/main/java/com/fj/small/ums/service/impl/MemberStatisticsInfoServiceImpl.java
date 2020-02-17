package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.MemberStatisticsInfo;
import com.fj.small.ums.mapper.MemberStatisticsInfoMapper;
import com.fj.small.ums.service.MemberStatisticsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员统计信息 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoMapper, MemberStatisticsInfo> implements MemberStatisticsInfoService {

}

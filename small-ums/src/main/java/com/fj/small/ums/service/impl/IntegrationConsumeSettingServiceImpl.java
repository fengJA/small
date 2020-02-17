package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.IntegrationConsumeSetting;
import com.fj.small.ums.mapper.IntegrationConsumeSettingMapper;
import com.fj.small.ums.service.IntegrationConsumeSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 积分消费设置 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class IntegrationConsumeSettingServiceImpl extends ServiceImpl<IntegrationConsumeSettingMapper, IntegrationConsumeSetting> implements IntegrationConsumeSettingService {

}

package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.MemberRuleSetting;
import com.fj.small.ums.mapper.MemberRuleSettingMapper;
import com.fj.small.ums.service.MemberRuleSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员积分成长规则表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingMapper, MemberRuleSetting> implements MemberRuleSettingService {

}

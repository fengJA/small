package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.MemberLevel;
import com.fj.small.ums.mapper.MemberLevelMapper;
import com.fj.small.ums.service.MemberLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员等级表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {

}

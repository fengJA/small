package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.MemberTask;
import com.fj.small.ums.mapper.MemberTaskMapper;
import com.fj.small.ums.service.MemberTaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements MemberTaskService {

}

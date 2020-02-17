package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.AdminRoleRelation;
import com.fj.small.ums.mapper.AdminRoleRelationMapper;
import com.fj.small.ums.service.AdminRoleRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationMapper, AdminRoleRelation> implements AdminRoleRelationService {

}

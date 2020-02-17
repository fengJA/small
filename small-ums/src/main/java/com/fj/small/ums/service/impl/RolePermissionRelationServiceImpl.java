package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.RolePermissionRelation;
import com.fj.small.ums.mapper.RolePermissionRelationMapper;
import com.fj.small.ums.service.RolePermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 后台用户角色和权限关系表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class RolePermissionRelationServiceImpl extends ServiceImpl<RolePermissionRelationMapper, RolePermissionRelation> implements RolePermissionRelationService {

}

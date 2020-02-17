package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fj.small.ums.entity.MemberMemberTagRelation;
import com.fj.small.ums.mapper.MemberMemberTagRelationMapper;
import com.fj.small.ums.service.MemberMemberTagRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationMapper, MemberMemberTagRelation> implements MemberMemberTagRelationService {

}

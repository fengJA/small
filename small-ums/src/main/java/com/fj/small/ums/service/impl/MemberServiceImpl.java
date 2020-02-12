package com.fj.small.ums.service.impl;

import com.fj.small.ums.entity.Member;
import com.fj.small.ums.mapper.MemberMapper;
import com.fj.small.ums.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}

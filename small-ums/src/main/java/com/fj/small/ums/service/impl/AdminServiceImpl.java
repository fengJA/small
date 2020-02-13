package com.fj.small.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fj.small.ums.entity.Admin;
import com.fj.small.ums.mapper.AdminMapper;
import com.fj.small.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.DigestUtils;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Component
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

    @Autowired
    AdminMapper adminMapper;

    // 登陆验证
    @Override
    public Admin login(String username, String password) {

        String ps = DigestUtils.md5DigestAsHex(password.getBytes());
        QueryWrapper<Admin> eq = new QueryWrapper<Admin>().eq("username", username).eq("password", ps);
        Admin admin = adminMapper.selectOne(eq);

        return admin;
    }

    // 获取用户详情
    @Override
    public Admin getUserInfo(String username) {

        return adminMapper.selectOne(new QueryWrapper<Admin>().eq("username", username));
    }
}

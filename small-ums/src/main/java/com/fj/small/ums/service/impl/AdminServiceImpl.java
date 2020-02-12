package com.fj.small.ums.service.impl;

import com.fj.small.ums.entity.Admin;
import com.fj.small.ums.mapper.AdminMapper;
import com.fj.small.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}

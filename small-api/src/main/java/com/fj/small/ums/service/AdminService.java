package com.fj.small.ums.service;

import com.fj.small.ums.entity.Admin;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface AdminService extends IService<Admin> {

    Admin login(String username, String password);

    Admin getUserInfo(String userName);
}

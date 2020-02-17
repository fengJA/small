package com.fj.small.ums.mapper;

import com.fj.small.ums.entity.Admin;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Mapper
public interface AdminMapper extends BaseMapper<Admin> {

}

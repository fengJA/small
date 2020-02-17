package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.Album;
import com.fj.small.pms.mapper.AlbumMapper;
import com.fj.small.pms.service.AlbumService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}

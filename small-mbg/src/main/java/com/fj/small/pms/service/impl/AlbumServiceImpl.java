package com.fj.small.pms.service.impl;

import com.fj.small.pms.entity.Album;
import com.fj.small.pms.mapper.AlbumMapper;
import com.fj.small.pms.service.AlbumService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-02-17
 */
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}

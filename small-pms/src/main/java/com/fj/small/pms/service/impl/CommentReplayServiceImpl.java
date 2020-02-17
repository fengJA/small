package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.CommentReplay;
import com.fj.small.pms.mapper.CommentReplayMapper;
import com.fj.small.pms.service.CommentReplayService;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 产品评价回复表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements CommentReplayService {

}

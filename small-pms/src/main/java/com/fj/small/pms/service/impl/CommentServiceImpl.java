package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.Comment;
import com.fj.small.pms.mapper.CommentMapper;
import com.fj.small.pms.service.CommentService;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}

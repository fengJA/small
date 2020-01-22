package com.fj.small.cms.service.impl;

import com.fj.small.cms.entity.Topic;
import com.fj.small.cms.mapper.TopicMapper;
import com.fj.small.cms.service.TopicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 话题表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
public class TopicServiceImpl extends ServiceImpl<TopicMapper, Topic> implements TopicService {

}

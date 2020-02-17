package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.FeightTemplate;
import com.fj.small.pms.mapper.FeightTemplateMapper;
import com.fj.small.pms.service.FeightTemplateService;
import org.springframework.stereotype.Component;


/**
 * <p>
 * 运费模版 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateMapper, FeightTemplate> implements FeightTemplateService {

}

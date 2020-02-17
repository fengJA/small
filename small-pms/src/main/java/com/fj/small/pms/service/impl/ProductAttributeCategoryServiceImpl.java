package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.ProductAttributeCategory;
import com.fj.small.pms.mapper.ProductAttributeCategoryMapper;
import com.fj.small.pms.service.ProductAttributeCategoryService;
import com.fj.small.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {

    @Autowired
    ProductAttributeCategoryMapper attributeCategoryMapper;

    @Override
    public PageInfoVo productAttributeCategoryPageInfo(Integer pageNum, Integer pageSize) {
        IPage<ProductAttributeCategory> iPage = attributeCategoryMapper.selectPage(new Page<ProductAttributeCategory>(pageNum, pageSize), null);

        // 返回分页数据对象
        return PageInfoVo.getVo(iPage,pageSize.longValue());
    }
}

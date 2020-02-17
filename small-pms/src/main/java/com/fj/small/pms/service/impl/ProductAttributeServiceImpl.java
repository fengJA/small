package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.ProductAttribute;
import com.fj.small.pms.mapper.ProductAttributeMapper;
import com.fj.small.pms.service.ProductAttributeService;
import com.fj.small.vo.PageInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * <p>
 * 商品属性参数表 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class ProductAttributeServiceImpl extends ServiceImpl<ProductAttributeMapper, ProductAttribute> implements ProductAttributeService {
    @Autowired
    ProductAttributeMapper attributeMapper;

    @Override
    public PageInfoVo getCatalogAttribute(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        QueryWrapper<ProductAttribute> eq = new QueryWrapper<ProductAttribute>().eq("product_attribute_category_id",cid).eq("type", type);
        IPage<ProductAttribute> iPage = attributeMapper.selectPage(new Page<ProductAttribute>(pageNum, pageSize), eq);
        return PageInfoVo.getVo(iPage,pageSize.longValue());
    }
}

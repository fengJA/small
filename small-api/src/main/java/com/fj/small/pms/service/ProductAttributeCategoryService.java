package com.fj.small.pms.service;

import com.fj.small.pms.entity.ProductAttributeCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fj.small.vo.PageInfoVo;

/**
 * <p>
 * 产品属性分类表 服务类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface ProductAttributeCategoryService extends IService<ProductAttributeCategory> {

    /**
     * 分页查询所有属性分类
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfoVo productAttributeCategoryPageInfo(Integer pageNum, Integer pageSize);
}

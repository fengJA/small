package com.fj.small.pms.service;

import com.fj.small.pms.entity.ProductAttribute;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fj.small.vo.PageInfoVo;

/**
 * <p>
 * 商品属性参数表 服务类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface ProductAttributeService extends IService<ProductAttribute> {

    PageInfoVo getCatalogAttribute(Long cid, Integer type, Integer pageSize, Integer pageNum);
}

package com.fj.small.pms.mapper;

import com.fj.small.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fj.small.vo.product.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 Mapper 接口
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface ProductCategoryMapper extends BaseMapper<ProductCategory> {


    List<PmsProductCategoryWithChildrenItem> listCatelogWithChildren(int i);
}

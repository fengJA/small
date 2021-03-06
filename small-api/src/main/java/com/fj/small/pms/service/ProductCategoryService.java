package com.fj.small.pms.service;

import com.fj.small.pms.entity.ProductCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fj.small.vo.product.PmsProductCategoryWithChildrenItem;

import java.util.List;

/**
 * <p>
 * 产品分类 服务类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface ProductCategoryService extends IService<ProductCategory> {

    List<PmsProductCategoryWithChildrenItem> listWithChildren(int i);
}

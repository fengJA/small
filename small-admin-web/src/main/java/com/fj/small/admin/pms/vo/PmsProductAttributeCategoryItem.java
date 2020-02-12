package com.fj.small.admin.pms.vo;

import com.fj.small.pms.entity.ProductAttribute;
import com.fj.small.pms.entity.ProductAttributeCategory;
import lombok.Data;

import java.util.List;

/**
 * 包含有分类下属性的vo
 */
@Data
public class PmsProductAttributeCategoryItem extends ProductAttributeCategory {
    private List<ProductAttribute> productAttributeList;


}

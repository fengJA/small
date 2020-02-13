package com.fj.small.pms.service;

import com.fj.small.pms.entity.Product;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fj.small.vo.PageInfoVo;
import com.fj.small.vo.product.PmsProductQueryParam;

/**
 * <p>
 * 商品信息 服务类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface ProductService extends IService<Product> {

    /**
     * 根据复杂条件查询分页数据
     * @param productQueryParam
     * @return
     */
    PageInfoVo productPageInfo(PmsProductQueryParam productQueryParam);
}

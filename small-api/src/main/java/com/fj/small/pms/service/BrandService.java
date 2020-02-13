package com.fj.small.pms.service;

import com.fj.small.pms.entity.Brand;
import com.baomidou.mybatisplus.extension.service.IService;
import com.fj.small.vo.PageInfoVo;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
public interface BrandService extends IService<Brand> {

    /**
     * 查询品牌列表
     * @param keyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfoVo brandPageInfo(String keyword, Integer pageNum, Integer pageSize);
}

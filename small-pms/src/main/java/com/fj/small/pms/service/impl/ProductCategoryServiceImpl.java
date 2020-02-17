package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.constant.SysCacheConstant;
import com.fj.small.pms.entity.ProductCategory;
import com.fj.small.pms.mapper.ProductCategoryMapper;
import com.fj.small.pms.service.ProductCategoryService;
import com.fj.small.vo.product.PmsProductCategoryWithChildrenItem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 产品分类 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Slf4j
@Service
@Component
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory> implements ProductCategoryService {
    @Autowired
    ProductCategoryMapper productCategoryMapper;

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    private Map<String,Object> map = new HashMap<>();

    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithChildren(int i) {

        Object cacheMenu = redisTemplate.opsForValue().get(SysCacheConstant.CATEGORY_MENU_CACHE_KEY);
        List<PmsProductCategoryWithChildrenItem> items;
        if (cacheMenu !=null){
            log.debug("菜单数据命中缓存。。。");
            items = (List<PmsProductCategoryWithChildrenItem>) cacheMenu;
        }else {
            items = productCategoryMapper.listCatelogWithChildren(i);
            redisTemplate.opsForValue().set(SysCacheConstant.CATEGORY_MENU_CACHE_KEY,items);
        }

        return items;
    }
}

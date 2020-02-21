package com.fj.small.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fj.small.pms.entity.Product;
import com.fj.small.pms.entity.ProductAttributeValue;
import com.fj.small.pms.mapper.ProductAttributeMapper;
import com.fj.small.pms.mapper.ProductAttributeValueMapper;
import com.fj.small.pms.mapper.ProductMapper;
import com.fj.small.pms.service.ProductService;
import com.fj.small.vo.PageInfoVo;
import com.fj.small.vo.product.PmsProductParam;
import com.fj.small.vo.product.PmsProductQueryParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author fj
 * @since 2020-01-22
 */
@Service
@Component
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductAttributeValueMapper productAttributeValueMapper;

    @Override
    public PageInfoVo productPageInfo(PmsProductQueryParam param) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();

        if(param.getBrandId()!=null){
            //前端传了关于商品的所有信息
            wrapper.eq("brand_id",param.getBrandId());
        }

        if(!StringUtils.isEmpty(param.getKeyword())){
            wrapper.like("name",param.getKeyword());
        }

        if(param.getProductCategoryId()!=null){
            wrapper.eq("product_category_id",param.getProductCategoryId());
        }

        if(!StringUtils.isEmpty(param.getProductSn())){
            wrapper.like("product_sn",param.getProductSn());
        }

        if(param.getPublishStatus()!=null){
            wrapper.eq("publish_status",param.getPublishStatus());
        }

        if(param.getVerifyStatus()!=null){
            wrapper.eq("verify_status",param.getVerifyStatus());
        }

        IPage<Product> page = productMapper.selectPage(new Page<Product>(param.getPageNum(), param.getPageSize()), wrapper);

        PageInfoVo pageInfoVo = new PageInfoVo(page.getTotal(),page.getPages(),page.getSize(),page.getRecords(),page.getCurrent());


        return pageInfoVo;
    }

    @Override
    public void saveProduct(PmsProductParam productParam) {
        //1）、pms_product：保存商品基本信息
        Product product = new Product();
        BeanUtils.copyProperties(productParam,product); // 工具类，将productParam里面的属性值拷贝到Product中，只要字段一样，就拷贝
        productMapper.insert(product);

        //2）、pms_product_attribute_value：保存这个商品对应的所有属性的值
        List<ProductAttributeValue> attributeValueList = productParam.getProductAttributeValueList();
        for (ProductAttributeValue attributeValue : attributeValueList) {
            productAttributeValueMapper.insert(attributeValue);
        }


    }
}

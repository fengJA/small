package com.fj.small.to.es;

import com.fj.small.pms.entity.SkuStock;
import com.fj.small.to.es.EsProductAttributeValue;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class EsSkuProductInfo extends SkuStock implements Serializable {


    private String skuTitle;//sku的特定标题
    /**
     * 每个sku不同的属性以及他的值
     *
     * 颜色：黑色
     * 内存：128
     *
     * 销售属性名；
     */
    List<EsProductAttributeValue> attributeValues;


}

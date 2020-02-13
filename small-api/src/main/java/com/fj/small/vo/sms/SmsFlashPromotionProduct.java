package com.fj.small.vo.sms;


import com.fj.small.pms.entity.Product;
import com.fj.small.sms.entity.FlashPromotionProductRelation;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 */
public class SmsFlashPromotionProduct extends FlashPromotionProductRelation {
    @Getter
    @Setter
    private Product product;
}

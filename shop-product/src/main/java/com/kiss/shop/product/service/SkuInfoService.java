package com.kiss.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiss.common.utils.PageUtils;
import com.kiss.shop.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author kiss
 * @email 2434688168@qq.com
 * @date 2020-10-09 15:26:43
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


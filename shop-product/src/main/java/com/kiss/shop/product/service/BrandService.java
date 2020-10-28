package com.kiss.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiss.common.utils.PageUtils;
import com.kiss.shop.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author kiss
 * @email 2434688168@qq.com
 * @date 2020-10-09 15:26:43
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

}


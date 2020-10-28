package com.kiss.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiss.common.utils.PageUtils;
import com.kiss.shop.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author kiss
 * @email 2434688168@qq.com
 * @date 2020-10-09 15:26:42
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


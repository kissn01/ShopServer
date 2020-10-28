package com.kiss.shop.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kiss.common.utils.PageUtils;
import com.kiss.shop.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author kiss
 * @email 2434688168@qq.com
 * @date 2020-10-09 15:26:43
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


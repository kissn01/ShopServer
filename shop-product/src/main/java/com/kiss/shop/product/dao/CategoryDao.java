package com.kiss.shop.product.dao;

import com.kiss.shop.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author kiss
 * @email 2434688168@qq.com
 * @date 2020-10-09 15:26:43
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

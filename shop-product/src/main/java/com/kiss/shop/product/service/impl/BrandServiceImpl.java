package com.kiss.shop.product.service.impl;

import com.kiss.shop.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kiss.common.utils.PageUtils;
import com.kiss.common.utils.Query;

import com.kiss.shop.product.dao.BrandDao;
import com.kiss.shop.product.entity.BrandEntity;
import com.kiss.shop.product.service.BrandService;
import org.springframework.util.StringUtils;


@Service
public class BrandServiceImpl extends ServiceImpl<BrandDao, BrandEntity> implements BrandService {


    //报错
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<BrandEntity> page = this.page(
                new Query<BrandEntity>().getPage(params),
                new QueryWrapper<BrandEntity>()
        );

        return new PageUtils(page);
    }

    //不报错 没结果
//    @Override
//    public PageUtils queryPage(Map<String, Object> params)
//    {
//        System.out.println("=======================");
//        System.out.println(params);
//            return  null;
//    }




//    @Override
//    public PageUtils queryPage(Map<String, Object> params)
//    {
//        System.out.println("=======================");
//        System.out.println(params);
//        //1、获取key
//        String key = (String) params.get("key");
//        System.out.println(key);
//        QueryWrapper<BrandEntity> queryWrapper = new QueryWrapper<>();
//        if(!StringUtils.isEmpty(key)){
//            queryWrapper.eq("brand_id",key).or().like("name",key);
//        }
//
//        IPage<BrandEntity> page = this.page(
//                new Query<BrandEntity>().getPage(params),
//                queryWrapper
//
//        );
//
//        return new PageUtils(page);
//    }

}
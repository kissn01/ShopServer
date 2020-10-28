package com.kiss.shop.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName ShopProductApplication
 * @Description TODO
 * @Author kiss
 * @Date 2020/10/9 14:42
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.kiss.shop.product.dao")
public class ShopProductApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(ShopProductApplication.class,args);
    }
}

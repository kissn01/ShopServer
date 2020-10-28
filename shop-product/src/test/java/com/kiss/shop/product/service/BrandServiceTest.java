package com.kiss.shop.product.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class BrandServiceTest
{

    @Autowired
    BrandService brandService;



    @Test
    void queryPage()
    {
        System.out.println(brandService.list());

    }
}
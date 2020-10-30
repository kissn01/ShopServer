package com.kiss.shop.product.service;

import com.kiss.common.utils.PageUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BrandServiceTest {

    @Autowired
    BrandService brandService;

    @Test
    public void queryPage() {
        Map<String, Object> map = new HashMap<>();
        PageUtils pageUtils = brandService.queryPage(map);
        System.out.println(pageUtils);
    }
}
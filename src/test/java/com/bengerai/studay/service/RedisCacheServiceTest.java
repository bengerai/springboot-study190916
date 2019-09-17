package com.bengerai.studay.service;

import com.bengerai.studay.entity.Company;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisCacheServiceTest {


    private static final Logger LOGGER = LoggerFactory.getLogger(RedisCacheServiceTest.class);

    /**
     * redisCacheService.
     */
    @Autowired
    private RedisCacheService redisCacheService;

    @Test
    public void getCompany() {

        final String code = UUID.randomUUID().toString();
        //final String code = "ad95a502-30c9-4223-a321-17c0675c2184";

        System.out.println("run in >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        final Company company = redisCacheService.getCompany(code);
        System.out.println("run out >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Assert.assertNotNull(company);
        Assert.assertEquals(code, company.getCode());
    }

}

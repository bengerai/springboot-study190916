package com.bengerai.studay.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StringRedisServiceTest {

    /** logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(StringRedisServiceTest.class);

    @Autowired
    private StringRedisService stringRedisService;

    @Test
    public void setString() {

        stringRedisService.setString("name", "bengerai");

    }

    @Test
    public void getString() {
        final String value = stringRedisService.getString("name");
        LOGGER.info("get value from redis : {}", value);
        Assert.assertEquals("bengerai", value);
    }

}

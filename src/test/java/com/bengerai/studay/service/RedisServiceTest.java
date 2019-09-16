package com.bengerai.studay.service;

import com.bengerai.studay.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisServiceTest {

    /** logger. */
    private static final Logger LOGGER = LoggerFactory.getLogger(RedisServiceTest.class);

    @Autowired
    private RedisService redisService;

    @Test
    public void setObj() {
        final User user = new User();
        user.setName("bengerai");
        user.setAge(18);
        redisService.setObj("user", user);
    }

    @Test
    public void getObj() {
        final User user = redisService.getObj("user");
        LOGGER.info("get bean from redis : {}", user.toString());
    }

}

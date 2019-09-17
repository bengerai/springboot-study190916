package com.bengerai.studay.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

/**
 * 测试redis 操作 string的服务类.
 *
 * @author zhouyl bengerai@126.com
 */
@Service
public class StringRedisService {

    /**
     * spring提供的redis操作服务类.
     */
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 设置string键值对到redis.
     *
     * @param key 键
     * @param value 值
     */
    public void setString(final String key, final String value) {

        stringRedisTemplate.opsForValue().set(key, value);
    }

    /**
     * 由redis中获取key对应的值.
     *
     * @param key 键
     * @return 值
     */
    public String getString(final String key) {

        return stringRedisTemplate.opsForValue().get(key);
    }

}

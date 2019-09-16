package com.bengerai.studay.service;

import com.bengerai.studay.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * 测试redis 操作 object的服务类.
 *      感觉这个属于应用教学code,实战意义不大
 * </pre>
 * @author zhouyl bengerai@126.com
 */
@Service
public class RedisService {

    /**
     * redis操作服务接口实例.
     */
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 存入redis.
     * @param key 键
     * @param user 值
     */
    public void setObj(final String key, final User user) {

        redisTemplate.opsForValue().set(key, user);
    }

    /**
     * 从redis读取.
     * @param key 键
     * @return 值
     */
    public User getObj(final String key) {

        return (User) redisTemplate.opsForValue().get(key);
    }
}

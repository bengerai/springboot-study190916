package com.bengerai.studay.service;

import com.bengerai.studay.entity.Company;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * <pre>
 * 测试@Cacheable 操作 object的服务类.
 * </pre>
 * @author zhouyl bengerai@126.com
 */
@Service
public class RedisCacheService {

    /**
     * SLF4J LOGGER.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger("BENGERAI");

    /**
     * 查询Object.
     * @param code 编码
     * @return object
     */
    @Cacheable(value = "companys", key = "#code")
    public Company getCompany(final String code) {
        LOGGER.info("\n》》》》》》》run in getCompany, code[{}]《《《《《《", code);
        return new Company("bengerai.com", code);
    }
}

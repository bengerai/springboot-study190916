package com.bengerai.studay.entity;

import java.io.Serializable;

/**
 * 模拟需要缓存的数据对象类，注意：这里必须实现序列化接口.
 * @author zhouyl bengerai@126.com
 */
public class Company implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = -4872725261455200646L;

    /** 名称. */
    private String name;

    /** 编码. */
    private String code;

    /**
     * 无参.
     */
    public Company() {
        super();
    }

    /**
     * 带参.
     * @param name 名称
     * @param code 编码
     */
    public Company(String name, String code) {

        this.name = name;
        this.code = code;
    }

    /**
     * Gets the value of name
     *
     * @return the value of name
     */
    public String getName() {

        return name;
    }

    /**
     * Sets the name
     * <p>You can use getName() to get the value of name</p>
     *
     * @param name name
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * Gets the value of code
     *
     * @return the value of code
     */
    public String getCode() {

        return code;
    }

    /**
     * Sets the code
     * <p>You can use getCode() to get the value of code</p>
     *
     * @param code code
     */
    public void setCode(String code) {

        this.code = code;
    }

}

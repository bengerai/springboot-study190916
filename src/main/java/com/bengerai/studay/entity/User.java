package com.bengerai.studay.entity;

import java.io.Serializable;

/**
 * 模拟需要缓存的数据对象类，注意：这里必须实现序列化接口.
 * @author zhouyl bengerai@126.com
 */
public class User implements Serializable {

    /** serial code.*/
    private static final long serialVersionUID = 1058894887690675885L;

    /**
     * 姓名.
     */
    private String name;

    /**
     * 年龄.
     */
    private Integer age;

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
     * Gets the value of age
     *
     * @return the value of age
     */
    public Integer getAge() {

        return age;
    }

    /**
     * Sets the age
     * <p>You can use getAge() to get the value of age</p>
     *
     * @param age age
     */
    public void setAge(Integer age) {

        this.age = age;
    }

    @Override
    public String toString() {

        return "User{" + "name='" + name + '\'' + ", age=" + age + '}';
    }

}

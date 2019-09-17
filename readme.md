# 项目描述
  本项目主要是探究springboot集成redis，实现如下两种方式
  * 通过spring提供的StringRedisTemplate和RedisTemplate服务读写redis
  * 通过@Cacheable注解方式使用redis作为缓存


### 1、StringRedisTemplate、RedisTemplate服务读写redis
   本想尝试写一个通用的Object set/get方法，暂时没折腾明白
  
  
### 2、@Cacheable + redis实现缓存
   这里写两点注意吧：
   * @Cacheable是spring的注解，想要使用redis,就需要通过CacheManager的方式管理缓存存储方式；
   * @Cacheable(value = "companys", key = "#code") 操作后，在redis-cli中是以如下两个命令查看
   * > KEYS companys* 查看相关的键
   * > get companys::abcd123456XXXXX984  查看具体一条数据


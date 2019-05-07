package com.wd.xyf.conf;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.cache.RedisCacheWriter;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

/**
 * @ClassName RedisConfiguration
 * @Description Redis配置类
 * @Author wangdi
 * @Date 2019/2/11 15:39
 * @Version 1.0
 **/
@Configuration
//开启我们的项目支持缓存
@EnableCaching
public class RedisConfiguration {

	@Bean
	public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
		//设置失效时间
		RedisCacheConfiguration redisCacheConfiguration = RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofSeconds(30));
		return RedisCacheManager.builder(RedisCacheWriter.nonLockingRedisCacheWriter(redisConnectionFactory)).cacheDefaults(redisCacheConfiguration).build();
	}
}

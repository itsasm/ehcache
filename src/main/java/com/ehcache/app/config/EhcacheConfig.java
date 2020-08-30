package com.ehcache.app.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCache;
import org.springframework.cache.support.SimpleCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class EhcacheConfig {
	
	@Bean
	public CacheManager cacheManager() {
	SimpleCacheManager cacheManager = new SimpleCacheManager();
	List<Cache> caches = new ArrayList<Cache>();
	caches.add(new ConcurrentMapCache("areaOfCircleCache"));
	cacheManager.setCaches(caches);
	return cacheManager;
	}
}

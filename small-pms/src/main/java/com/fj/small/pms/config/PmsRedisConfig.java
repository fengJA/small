package com.fj.small.pms.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;

@Configuration
public class PmsRedisConfig {
    @Bean
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory conn){
        RedisTemplate<Object,Object> template = new RedisTemplate<>();
        template.setConnectionFactory(conn);
        template.setDefaultSerializer(new GenericJackson2JsonRedisSerializer());
        return template            ;
    }
}

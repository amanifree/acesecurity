package com.github.wxiaoqi.security.acesale;

import com.ace.cache.EnableAceCache;
import com.github.wxiaoqi.security.auth.client.EnableAceAuthClient;
import com.spring4all.swagger.EnableSwagger2Doc;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

@EnableEurekaClient
@EnableCircuitBreaker
@EnableFeignClients({"com.github.wxiaoqi.security.auth.client.feign"})
@EnableScheduling
@EnableAceAuthClient
@EnableAceCache
@EnableTransactionManagement
@MapperScan("com.github.wxiaoqi.security.acesale.mapper")
@EnableSwagger2Doc
public class AceSaleApplication {

    /*public static void main(String[] args) {
        SpringApplication.run(AceSaleApplication.class, args);
    }*/

    public static void main(String[] args) {
        new SpringApplicationBuilder(AceSaleApplication.class).web(true).run(args);    }
}

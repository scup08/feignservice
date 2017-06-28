package com.xhld.feignservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.xhld.feignservice.config.FooConfiguration;

@FeignClient(name = "stores", configuration = FooConfiguration.class)
public interface StoreClient {
    //..
}
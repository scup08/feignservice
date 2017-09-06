package com.xhld.feignservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @FeignClient value值指定请求的服务名
 * @RequestMapping value值指定请求的服务路径（服务都是以restful api暴露出来的）
 */
@FeignClient(value = "eurekaclientservice")
public interface EurekaClientService {
    @RequestMapping(value = "/test111/user/{id}",method = RequestMethod.GET)
    String getUser(@PathVariable("id") String id);
}
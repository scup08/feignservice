package com.xhld.feignservice.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xhld.feignservice.model.AdvertGroupVO;


@FeignClient(name = "ea")  //  [A]
public interface AdvertGroupRemoteService {

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.GET) // [B]
    AdvertGroupVO findByGroupId(@PathVariable("groupId") Integer adGroupId); // [C]

    @RequestMapping(value = "/group/{groupId}", method = RequestMethod.PUT)
    void update(@PathVariable("groupId") Integer groupId, @RequestParam("groupName") String groupName);
}
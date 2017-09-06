package com.xhld.feignservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xhld.feignservice.service.EurekaClientService;


@RestController
public class HiController {

    @Autowired
    EurekaClientService eurekaClientService;
    
    @RequestMapping(value = "/user1/{id}",method = RequestMethod.GET)
    public String sayHi(@PathVariable("id") String id){
        return eurekaClientService.getUser(id);
    }
}
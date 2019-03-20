package org.gw.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @DATA 2019-03-18 16:06
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RestController
public class ConController {



    @Autowired
    RestTemplate restTemplate;

    /**
     * 消费服务
     */
    @RequestMapping("/callSayHello")
    public String services(@RequestParam("name") String name) {

        String callServiceResult = restTemplate.getForEntity("http://spring-cloud-nacos-provider/hello?name="+name,String.class).getBody();
        System.out.println(callServiceResult);
        return callServiceResult;
    }


}

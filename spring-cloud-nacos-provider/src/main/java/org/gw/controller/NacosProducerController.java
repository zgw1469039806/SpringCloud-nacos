package org.gw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @DATA 2019-03-18 15:24
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@RestController
public class NacosProducerController {

    @RequestMapping("/hello")
    public String hello(@RequestParam("name")String name)
    {
        return "hello::"+name;
    }
}

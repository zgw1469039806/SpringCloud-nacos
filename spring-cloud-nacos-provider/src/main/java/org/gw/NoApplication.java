package org.gw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @DATA 2019-03-18 15:21
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NoApplication {


    public static void main(String[] args) {
        SpringApplication.run(NoApplication.class,args);
    }
}

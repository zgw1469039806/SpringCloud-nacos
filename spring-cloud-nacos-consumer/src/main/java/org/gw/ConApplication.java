package org.gw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @DATA 2019-03-18 15:45
 * @Author 张国伟  WeChat:17630376104
 * @Description TODO
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConApplication
{


    @LoadBalanced
    @Bean
    public RestTemplate resultTemplate()
    {
        RestTemplate template = new RestTemplate();
        return template;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(ConApplication.class, args);
    }
}

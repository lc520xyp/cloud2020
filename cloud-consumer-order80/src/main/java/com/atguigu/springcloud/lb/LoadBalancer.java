package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author lc
 * @create 2021-11-23 19:40
 */
public interface LoadBalancer {
    ServiceInstance instance(List<ServiceInstance> serviceInstances);


}

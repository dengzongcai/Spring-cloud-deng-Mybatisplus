package com.deng.quartz.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(value = "deng-currency")
@Service
public interface CurrentyFeignService {
    /**
     * 报警定时任务
     */
    @PostMapping(value = "/testfeigncontroller/testTask01")
    void testTask01();


    /**
     * 报警定时任务
     */
    @PostMapping(value = "/testfeigncontroller/testTask02")
    void testTask02();

}

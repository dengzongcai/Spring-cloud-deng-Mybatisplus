package com.deng.currency.feign;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testfeigncontroller")
public class TestFeignController {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping("/testTask01")
    public void  testTask01(){
        logger.info("测试定时任务01========================");
    }

    @PostMapping("/testTask02")
    public void  testTask02(){

        logger.info("测试定时任务02========================");
    }

}

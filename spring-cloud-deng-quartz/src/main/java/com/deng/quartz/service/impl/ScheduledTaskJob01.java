package com.deng.quartz.service.impl;

import com.deng.quartz.feign.CurrentyFeignService;
import com.deng.quartz.service.ScheduledTaskJob;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

/**
 * @Description 测试类01
 * @Auther ZongCai
 * @Date 2021/7/16
 */
@Slf4j
@Service
public class ScheduledTaskJob01 implements ScheduledTaskJob {
    @Resource
    private CurrentyFeignService currentyfeignservice;

    @Override
    public void run() {
        // TODO 要处理的业务逻辑
        currentyfeignservice.testTask01();
        log.info("ScheduledTask => 01  run  当前线程名称 {} ", Thread.currentThread().getName());
    }
}
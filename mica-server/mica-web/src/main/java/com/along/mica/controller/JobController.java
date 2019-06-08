package com.along.mica.controller;

import cn.along.mica.scheduler.MicaScheduler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhengjianglong
 * @since 2019-06-09
 */
@Controller
public class JobController {
    @RequestMapping(value = "/addJob", method = RequestMethod.GET)
    @ResponseBody
    public String addJob() {
        try {
            String name = "zjlTest";
            String cron = "0/1 * * * * ?";
            MicaScheduler.addJob(name, cron);
            return "SUCCESS";
        } catch (Exception e) {
            return "FAILED";
        }
    }

}

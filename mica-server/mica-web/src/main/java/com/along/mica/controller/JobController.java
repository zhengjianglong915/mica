package com.along.mica.controller;

import cn.along.mica.scheduler.MicaScheduler;
import com.along.mica.dal.dao.JobDAO;
import com.along.mica.dal.dataobject.JobDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhengjianglong
 * @since 2019-06-09
 */
@Controller
public class JobController {

    @Autowired
    private JobDAO jobDAO;

    @RequestMapping(value = "/addJob", method = RequestMethod.GET)
    @ResponseBody
    public String addJob() {
        try {
            String name = "zjlTest";
            String cron = "0/1 * * * * ?";
            MicaScheduler.addJob(name, cron);

            JobDO jobDO = new JobDO();
            jobDO.setName("test");
            jobDO.setApp("app");
            jobDO.setCron("0/1 * * * * ?");
            jobDO.setDes("des");

            jobDAO.insert(jobDO);
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "FAILED";
        }
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    @ResponseBody
    public JobDO query(@RequestParam("id") Integer id) {
        try {

            JobDO jobDO = jobDAO.queryById(id);
            return jobDO;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

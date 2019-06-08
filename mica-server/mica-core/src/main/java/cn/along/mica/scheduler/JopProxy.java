package cn.along.mica.scheduler;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author zhengjianglong
 * @since 2019-06-09
 */
public class JopProxy implements Job {
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        JobDetail detail = jobExecutionContext.getJobDetail();
        System.out.println("execute " + detail.getKey());
    }
}

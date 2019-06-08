package cn.along.mica.scheduler;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author zhengjianglong
 * @since 2019-06-09
 */
public class MicaScheduler {

    private static Scheduler scheduler;

    public static void init() {
        try {
            StdSchedulerFactory factory = new StdSchedulerFactory();
            scheduler = factory.getScheduler();
            scheduler.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean addJob(String name, String cron) throws Exception {
        JobDetail jobDetail = JobBuilder.newJob(JopProxy.class).withIdentity(name).build();
        TriggerBuilder triggerBuilder = TriggerBuilder.newTrigger().withIdentity(name, Scheduler.DEFAULT_GROUP);
        triggerBuilder.withSchedule(CronScheduleBuilder.cronSchedule(cron));
        scheduler.scheduleJob(jobDetail, triggerBuilder.build());
        return true;
    }
}

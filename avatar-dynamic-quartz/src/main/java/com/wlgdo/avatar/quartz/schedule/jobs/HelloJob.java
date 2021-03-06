package com.wlgdo.avatar.quartz.schedule.jobs;


import com.wlgdo.avatar.quartz.common.SpringUtil;
import com.wlgdo.avatar.quartz.schedule.entity.JobAndTrigger;
import com.wlgdo.avatar.quartz.schedule.service.IJobAndTriggerService;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.List;


public class HelloJob implements BaseJob {

    private static Logger log = LoggerFactory.getLogger(HelloJob.class);

    public HelloJob() {

    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        String jobName = context.getJobDetail().getKey().getName();
        String group = context.getJobDetail().getKey().getGroup();
        IJobAndTriggerService iJobAndTriggerService = SpringUtil.getBean(IJobAndTriggerService.class);
        List<JobAndTrigger> lists = iJobAndTriggerService.list(group);
        log.info("HelloJob：{}", lists);
        log.info("HelloJob Job执行时间jobName:{}{}, ", jobName, new Date());
    }
}


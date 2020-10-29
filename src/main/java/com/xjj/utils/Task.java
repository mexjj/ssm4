package com.xjj.utils;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

public class Task extends QuartzJobBean {

    private static int i = 0;

    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("--------- begin ---------");
        System.out.println(" i = " + i++);
        System.out.println("--------- end ---------");
    }
}

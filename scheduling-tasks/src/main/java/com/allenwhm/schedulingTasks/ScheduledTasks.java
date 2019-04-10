package com.allenwhm.schedulingTasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by : allenwhm
 * DateTime : 2019-04-10 23:29
 **/
@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);

    private SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedDelay = 3000)
    public void reportCurrentTime() {
        LOG.info("Now is : " + formatter.format(new Date()));
    }
}

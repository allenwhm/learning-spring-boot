package com.allenwhm.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by : allenwhm
 * DateTime : 2019-03-10 11:19
 * https://spring.io/guides/gs/scheduling-tasks/
 *
 * add @EnableScheduling in XxxApplication
 **/
@Component
public class ScheduledTasks {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledTasks.class);
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedRate = 3000)
    public void printCurrentTime() {
        LOG.info(sdf.format(new Date()));
    }

}

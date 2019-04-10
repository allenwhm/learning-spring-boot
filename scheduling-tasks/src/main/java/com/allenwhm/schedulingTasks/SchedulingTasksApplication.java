package com.allenwhm.schedulingTasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by : allenwhm
 * DateTime : 2019-04-10 23:27
 **/
@SpringBootApplication
@EnableScheduling
public class SchedulingTasksApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchedulingTasksApplication.class, args);
    }
}

package com.allenwhm.st;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SchedulingTasksApplicationTest {

    @Autowired
    private ScheduledTasks tasks;

    @Test
    public void contextLoads() {
        // basic integration test that shows the context starts up properly
        assertThat(tasks).isNotNull();
    }
}
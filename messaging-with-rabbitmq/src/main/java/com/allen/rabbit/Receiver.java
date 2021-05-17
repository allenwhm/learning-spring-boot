package com.allen.rabbit;

import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

/**
 * @author allen
 * @date 2021/5/17 20:57
 */

@Component
public class Receiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        System.out.println("received message : " + message);
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}

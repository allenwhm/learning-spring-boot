package com.allen.rabbit;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author allen
 * @date 2021/5/17 21:12
 */

@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate template;
    private final Receiver receiver;

    public Runner(Receiver receiver, RabbitTemplate template) {
        this.receiver = receiver;
        this.template = template;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("sending messages...");
        template.convertAndSend(RabbitApplication.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }
}

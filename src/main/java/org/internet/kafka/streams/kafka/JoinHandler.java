package org.internet.kafka.streams.kafka;

import org.springframework.stereotype.Component;

@Component
public class JoinHandler {


    void handle(byte[] hello, byte[] world) {
        String message = String.format("Join handler for: '%s', and: '%s'",hello.toString(), world.toString());
        System.out.println(message);

    }
}

package org.internet.kafka.streams.kafka;

import org.internet.kafka.streams.config.HelloKafkaProducer;
import org.internet.kafka.streams.config.WorldKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class NawKafkaProducerService {

    @Autowired
    private Function<String, HelloKafkaProducer> stringHelloKafkaProducerFunction;

    @Autowired
    private Function<String, WorldKafkaProducer> stringWorldKafkaProducerFunction;

    public void storeHello(String key) {
        stringHelloKafkaProducerFunction.apply(key).apply("Hello".getBytes());
    }

    public void storeWorld(String key) {
        stringWorldKafkaProducerFunction.apply(key).apply("World".getBytes());
    }

}

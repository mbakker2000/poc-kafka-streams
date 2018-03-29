package org.internet.kafka.streams.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.function.Function;

@Configuration
public class KafkaProducerConfig {

    @Autowired
    private KafkaTemplate<String, byte[]> kafkaTemplate;

    private Function<KafkaTemplate<String, byte[]>, Function<String, Function<String, HelloKafkaProducer>>> produceHelloKafkaMessage = (kafkaTemplate) -> (topic) -> (key) -> (bytesToSend) -> kafkaTemplate.send(topic, key, bytesToSend);

    private Function<KafkaTemplate<String, byte[]>, Function<String, Function<String, WorldKafkaProducer>>> produceWorldKafkaMessage = (kafkaTemplate) -> (topic) -> (key) -> (bytesToSend) -> kafkaTemplate.send(topic, key, bytesToSend);

    @Bean
    public Function<String, HelloKafkaProducer> stringHelloKafkaProducerFunction(KafkaTemplate<String, byte[]> kafkaTemplate) {
        return produceHelloKafkaMessage.apply(kafkaTemplate).apply("helloTopic");
    }

    @Bean
    public Function<String, WorldKafkaProducer> stringWorldKafkaProducerFunction(KafkaTemplate<String, byte[]> kafkaTemplate) {
        return produceWorldKafkaMessage.apply(kafkaTemplate).apply("worldTopic");
    }

}

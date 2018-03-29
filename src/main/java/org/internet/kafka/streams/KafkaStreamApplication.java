package org.internet.kafka.streams;

import org.internet.kafka.streams.config.KafkaConfig;
import org.internet.kafka.streams.config.KafkaProducerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({KafkaConfig.class, KafkaProducerConfig.class})
@ComponentScan(basePackageClasses = KafkaStreamApplication.class)
public class KafkaStreamApplication {
    public static void main(String[] args) {
        SpringApplication.run(KafkaStreamApplication.class, args);
    }
}
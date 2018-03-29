package org.internet.kafka.streams.config;

import org.springframework.kafka.support.SendResult;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.function.Function;

public interface HelloKafkaProducer extends Function<byte[], ListenableFuture<SendResult<String, byte[]>>> {
}

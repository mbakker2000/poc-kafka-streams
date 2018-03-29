package org.internet.kafka.streams.api;

import org.internet.kafka.streams.kafka.NawKafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloWorldController {

    @Autowired
    private NawKafkaProducerService nawKafkaProducerService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam("key") String referenceKey) {

        nawKafkaProducerService.storeHello(referenceKey);
        return "Hello";
    }

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String world(@RequestParam("key") String referenceKey) {

        nawKafkaProducerService.storeWorld(referenceKey);
        return "World";
    }

}

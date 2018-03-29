POC kafka streams in a spring boot application 

Pre requirement -> install kafka

Start application by starting

org.internet.kafka.streams.KafkaStreamApplication class

use to produce messages in topics

- first
http://localhost:8080/api/world?key=1234
- then
http://localhost:8080/api/hello?key=1234

There should be some systemout logging be found in the form

``Join handler for: '[B@46324715', and: '[B@1e30b6c'``
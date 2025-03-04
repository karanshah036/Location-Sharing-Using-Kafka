package com.kafka.cab_book_user.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationServiceImpl implements LocationService {

//    In terminal use this command to subscribe to topic
//    bin/kafka-console-consumer.sh --topic cab-location --from-beginning --bootstrap-server localhost:9092

    @Override
    @KafkaListener(topics = "cab-location", groupId = "user-group")
    public void cabLocation(String location) {
        System.out.println(location);
    }
}

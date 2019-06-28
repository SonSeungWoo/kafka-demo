package me.seungwoo.consumer;

import me.seungwoo.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

/**
 * Created by Leo.
 * User: ssw
 * Date: 2019-06-28
 * Time: 16:13
 */
@Service
public class KafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    @KafkaListener(topics = "${message.topic.name}", groupId = "${kafka.groupId}")
    public void listen(String message) {
        System.out.println("message : "+message);
        LOGGER.info("Received Messasge in group : " + message);
    }
}

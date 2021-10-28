package com.learnkafka.libraryeventsconsumer.consumer;


import lombok.extern.log4j.Log4j2;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class LibraryEventsConsumer {

    @KafkaListener(topics = "library-events")
    public void onMessage(ConsumerRecord<Integer,String> consumerRecord){

        //The Kafka Container will get multiple messages at once but pass them one by one to this onMessage method.
        //Because we have 3 partitions, our consumer will poll from all three of them as shown in the logs
        log.info("ConsumerRecord : {}", consumerRecord );


    }



}

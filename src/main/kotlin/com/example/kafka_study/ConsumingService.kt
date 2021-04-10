package com.example.kafka_study

import com.example.kafka_study.KafkaConfig.Companion.GROUP_ID
import com.example.kafka_study.TopicConfig.Companion.TOPIC_TEST
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.KafkaHeaders
import org.springframework.messaging.handler.annotation.Header
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.stereotype.Component

@Component
class ConsumingService {

    @KafkaListener(topics = [TOPIC_TEST], containerFactory="kafkaListenerFactory")
    fun listenGroupFoo(message: String) {
        println("Received Message in group foo: $message")
    }

    @KafkaListener(topics = [TOPIC_TEST], containerFactory="filterKafkaListenerFactory")
    fun listenWithHeaders(@Payload message: String,
                          @Header(KafkaHeaders.RECEIVED_PARTITION_ID) partition: Int) {
        println("Received Message: $message from partition: $partition")
    }

}

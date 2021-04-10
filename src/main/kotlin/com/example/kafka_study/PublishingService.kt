package com.example.kafka_study

import com.example.kafka_study.TopicConfig.Companion.TOPIC_TEST
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.kafka.support.SendResult
import org.springframework.util.concurrent.ListenableFutureCallback

@Component
class PublishingService {
    @Autowired
    private lateinit var kafkaTemplate: KafkaTemplate<String, String>

    fun sendToTest(msg: String) {
        kafkaTemplate.send(TOPIC_TEST, msg)
    }

    fun sendToTestWithLog(msg: String) {
        val future = kafkaTemplate.send(TOPIC_TEST, msg)

        future.addCallback(object : ListenableFutureCallback<SendResult<String, String>?> {
            override fun onSuccess(result: SendResult<String, String>?) {
                println("Sent message=[$msg] with offset=[${result?.recordMetadata?.offset().toString()}]")
            }

            override fun onFailure(ex: Throwable) {
                println("Unable to send message=[$msg] due to : ${ex.message}")
            }
        })
    }
}

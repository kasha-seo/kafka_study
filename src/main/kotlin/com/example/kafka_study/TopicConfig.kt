package com.example.kafka_study

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class TopicConfig {
    /**
     * NewTopic을 이용하여 topic을 생성할수도 있다.
     */
    @Bean
    fun topicTest(): NewTopic {
        return NewTopic(TOPIC_AUTO_CREATE, 1, 1)
    }

    companion object {
        const val TOPIC_AUTO_CREATE = "auto-create"
        const val TOPIC_TEST = "test"
    }
}

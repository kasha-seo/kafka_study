package com.example.kafka_study

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
@EnableWebMvc
class KafkaStudyApplication

fun main(args: Array<String>) {
    runApplication<KafkaStudyApplication>(*args)
}

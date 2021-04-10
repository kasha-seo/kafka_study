package com.example.kafka_study

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/publish")
class PublishingController {
    @Autowired
    private lateinit var publishingService: PublishingService

    @GetMapping
    fun send(@RequestParam msg: String): String {
        publishingService.sendToTest(msg)
        return msg
    }
}

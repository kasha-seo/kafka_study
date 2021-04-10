package com.example.kafka_study

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/consume")
class ConsumingController {
    @Autowired
    private lateinit var consumingService: ConsumingService

    @GetMapping("/")
    fun aa() {
//        consumingService.listenGroupFoo()
    }
}

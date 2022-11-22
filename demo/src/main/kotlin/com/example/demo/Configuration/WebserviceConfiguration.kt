package com.example.demo.Configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component

@Component
@Configuration
@ConfigurationProperties(prefix = "webservice.pokemon")
class WebserviceConfiguration {
    lateinit var url: String
    lateinit var parameter: String
}
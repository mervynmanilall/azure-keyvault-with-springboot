package com.example.demo.KeyVault

import com.example.demo.Configuration.WebserviceConfiguration
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.httpGet
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class DemoRepo @Autowired constructor(
    private val webserviceConfiguration: WebserviceConfiguration
){
    @Value("\${pokemon-name}")
    private val pokemonName: String = ""

    fun getCarInfo(): String{
        val completeUrl = webserviceConfiguration.url+pokemonName
        val (request, response, result) = "$completeUrl"
            .httpGet().response()

        return response.toString();
    }
}
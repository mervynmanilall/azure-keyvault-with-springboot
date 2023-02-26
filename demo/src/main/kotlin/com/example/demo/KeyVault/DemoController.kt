package com.example.demo.KeyVault

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin(origins = ["*"])
@RequestMapping("/v1")
@Component
class DemoController @Autowired constructor(
    val demoRepo: DemoRepo
) {
    @GetMapping()
    fun getPokemonDetail(): String{
        return demoRepo.getPokemonInfo()
    }
}
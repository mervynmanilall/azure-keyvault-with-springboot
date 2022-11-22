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
//    az ad sp create-for-rbac --name key-vault-user --role Contributor --scopes /subscriptions/069c55db-dd0e-4608-aab4-a92fc88fe695
    @GetMapping()
    fun getCarDetail(): String{
//        return "hello world"
        return demoRepo.getCarInfo()
    }
}
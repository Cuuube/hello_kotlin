package com.zxod.hello_kotlin.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RequestMapping
import javax.annotation.Resource;
import com.zxod.hello_kotlin.service.HelloService

@RestController
@RequestMapping("/api")
class ApiController(var helloService: HelloService) {

    // get http://0.0.0.0:8080/api/ping?name=tom
    @GetMapping("/ping")
    fun ping(
        @RequestParam(value = "name", required = false) name: String
    ): String {
        return helloService.sayHello(name)
    }

}


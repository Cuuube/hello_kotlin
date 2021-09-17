package com.zxod.hello_kotlin.service

import org.springframework.stereotype.Service

@Service
class HelloService {
    fun toUpperCase(value: String): String {
        return value.uppercase()
    }
    public fun sayHello(arg: String): String {
        return String.format("Hello, %s", toUpperCase(arg))
    }
}

fun main(args: ArrayList<String>) {
    // var u = User("hahaha")
    // u.age = 99
    // println(u)

    var t = TestClass()
    t.name = "hahaAa"
    println(t.name)
    println(t.getName1())
}

// data class User(var name: String) {
//     name: String
//     var age: Int = 10
// }

class TestClass {
    var name: String = "aaa"
    get() = field.uppercase()

    fun getName1(): String {
        return name
    }
}
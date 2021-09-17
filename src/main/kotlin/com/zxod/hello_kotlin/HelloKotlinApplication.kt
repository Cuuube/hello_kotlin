package com.zxod.hello_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.Banner
import org.springframework.boot.WebApplicationType

@SpringBootApplication
class HelloKotlinApplication

fun main(args: Array<String>) {
	var springBuilder = SpringApplicationBuilder(HelloKotlinApplication::class.java).web(WebApplicationType.SERVLET).run(*args)
	run(args)
}

fun run(args: Array<String>) {
	var u = User("hahaha")
	u.age = 99
	println(u)
	println(u.age)

	val i = Thing("hahah", 22)
	println(i.toString())

	var t = TestClass()
	t.name = "hahaAa"
	println(t.name)
	println(t.getName1())

}

data class User(var name: String) {
    var age: Int = 10
}
data class Thing(
	var name: String,
	var age: Int,
)

class TestClass {
    var name: String = "aaa"
    get() = field.uppercase()

    fun getName1(): String {
        return name
    }
}
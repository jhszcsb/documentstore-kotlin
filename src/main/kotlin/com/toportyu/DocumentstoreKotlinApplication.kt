package com.toportyu

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class DocumentstoreKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(DocumentstoreKotlinApplication::class.java, *args)
}

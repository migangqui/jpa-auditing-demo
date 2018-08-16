package com.migangqui.auditing

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@EnableJpaRepositories(basePackages = arrayOf("com.migangqui.auditing.repository"))
@SpringBootApplication(scanBasePackages = arrayOf("com.migangqui.auditing"))
open class AuditingDemoApplication

fun main(args: Array<String>) {
    SpringApplication.run(AuditingDemoApplication::class.java, *args)
}

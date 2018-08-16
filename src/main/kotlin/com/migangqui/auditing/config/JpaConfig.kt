package com.migangqui.auditing.config

import mu.KotlinLogging
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.domain.AuditorAware
import com.migangqui.auditing.auditor.AuditorAwareImpl
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
open class JpaConfig {
	
	private val logger = KotlinLogging.logger {} 
	
	open @Bean fun auditorAware(): AuditorAware<String> {
		logger.info { "Defining auditorAware bean" }
		return AuditorAwareImpl()
	}
}
package com.migangqui.auditing.bootstrap

import com.migangqui.auditing.domain.DemoEntity
import com.migangqui.auditing.repository.DemoEntityRepository
import mu.KotlinLogging
import org.apache.commons.lang3.RandomStringUtils
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class DemoBootstrap(private val demoEntityRepository: DemoEntityRepository) {
	
	private val logger = KotlinLogging.logger {} 
	
	@PostConstruct
	fun setUp() {
		logger.info { "Setting up AuditingDemo" }
		
		/* Entity */
		val demoEntity: DemoEntity = DemoEntity(0, RandomStringUtils.randomAlphabetic(8), RandomStringUtils.randomAlphabetic(16))
		
		/* Persist entity*/
		val savedDemoEntity = demoEntityRepository.save(demoEntity)
		
		Thread.sleep(2000)
		
		/* Update entity */
		savedDemoEntity.name = "modified"
		demoEntityRepository.save(savedDemoEntity)
		
		/** Now check MySQL. Columns crated_by, creation_date, last_modified_by, last_modified_date **/
	}
}
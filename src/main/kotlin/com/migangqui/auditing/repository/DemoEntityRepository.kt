package com.migangqui.auditing.repository

import com.migangqui.auditing.domain.DemoEntity
import org.springframework.data.jpa.repository.JpaRepository


interface DemoEntityRepository : JpaRepository<DemoEntity, Int> {
	
}
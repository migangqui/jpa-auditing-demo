package com.migangqui.auditing.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import com.migangqui.auditing.auditor.Auditable

@Entity
class DemoEntity : Auditable<String>() {
	
	@Id
    @GeneratedValue
	val id: Int? = null
	var name: String? = null
	var content: String? = null
	
}
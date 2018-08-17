package com.migangqui.auditing.domain

import com.migangqui.auditing.auditor.Auditable
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class DemoEntity(@Id @GeneratedValue val id: Int, var name: String, var content: String) : Auditable<String>()
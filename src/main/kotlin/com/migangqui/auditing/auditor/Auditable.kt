package com.migangqui.auditing.auditor

import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.util.Date
import javax.persistence.EntityListeners
import javax.persistence.MappedSuperclass
import javax.persistence.Temporal
import javax.persistence.TemporalType.TIMESTAMP

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class Auditable<U> {
	
	@CreatedBy
	protected val createdBy: U? = null
	
	@CreatedDate
    @Temporal(TIMESTAMP)
    protected val creationDate: Date? = null

    @LastModifiedBy
    protected val lastModifiedBy: U? = null

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    protected val lastModifiedDate: Date? = null
}
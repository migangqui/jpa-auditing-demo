package com.migangqui.auditing.auditor

import org.springframework.data.domain.AuditorAware
import org.apache.commons.lang3.RandomStringUtils

class AuditorAwareImpl : AuditorAware<String> {
	
    override fun getCurrentAuditor(): String {
        return RandomStringUtils.randomAlphabetic(5).toUpperCase();
    }
	
}
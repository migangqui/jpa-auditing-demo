package com.migangqui.auditing.auditor

import org.springframework.data.domain.AuditorAware

class AuditorAwareImpl : AuditorAware<String> {
	
    override fun getCurrentAuditor(): String {
        return "Developer1";
    }
	
}
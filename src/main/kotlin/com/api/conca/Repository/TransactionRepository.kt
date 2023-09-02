package com.api.conca.Repository

import com.api.conca.Configuration.HibernateSessionManager
import org.springframework.stereotype.Repository

@Repository
class TransactionRepository: HibernateSessionManager() {

}
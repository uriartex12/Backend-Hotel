package com.api.conca.Configuration

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class HibernateSessionManager {

    @Autowired
    private lateinit var sessionFactory: SessionFactory

    lateinit var session: Session

    fun checkSession(): Session {
        if (!::session.isInitialized || !session.isOpen) {
            session = sessionFactory.openSession()
        }
        return session
    }

    fun closeSession() {
        if (::session.isInitialized && session.isOpen) {
            session.close()
        }
    }
}
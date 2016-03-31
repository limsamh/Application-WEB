package com.appliweb.Neko_Atsume.dao;
// Generated 29 mars 2016 22:39:51 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.appliweb.Neko_Atsume.entities.Chat;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Chat.
 * @see com.appliweb.Neko_Atsume.dao.Chat
 * @author Hibernate Tools
 */
public class ChatHome {

	private static final Log log = LogFactory.getLog(ChatHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Chat transientInstance) {
		log.debug("persisting Chat instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Chat instance) {
		log.debug("attaching dirty Chat instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("deprecation")
	public void attachClean(Chat instance) {
		log.debug("attaching clean Chat instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Chat persistentInstance) {
		log.debug("deleting Chat instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Chat merge(Chat detachedInstance) {
		log.debug("merging Chat instance");
		try {
			Chat result = (Chat) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Chat findById(java.lang.Integer id) {
		log.debug("getting Chat instance with id: " + id);
		try {
			Chat instance = (Chat) sessionFactory.getCurrentSession().get("com.appliweb.Neko_Atsume.dao.Chat", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Chat> findByExample(Chat instance) {
		log.debug("finding Chat instance by example");
		try {
			@SuppressWarnings("unchecked")
			List<Chat> results = (List<Chat>) sessionFactory.getCurrentSession()
					.createCriteria("com.appliweb.Neko_Atsume.dao.Chat").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}

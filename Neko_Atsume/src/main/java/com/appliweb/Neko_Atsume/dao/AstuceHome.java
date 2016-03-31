package com.appliweb.Neko_Atsume.dao;
// Generated 29 mars 2016 22:39:51 by Hibernate Tools 4.3.1.Final

import java.util.List;
import javax.naming.InitialContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.appliweb.Neko_Atsume.entities.Astuce;

import static org.hibernate.criterion.Example.create;

/**
 * Home object for domain model class Astuce.
 * @see com.appliweb.Neko_Atsume.dao.Astuce
 * @author Hibernate Tools
 */
public class AstuceHome {

	private static final Log log = LogFactory.getLog(AstuceHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Astuce transientInstance) {
		log.debug("persisting Astuce instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Astuce instance) {
		log.debug("attaching dirty Astuce instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	@SuppressWarnings("deprecation")
	public void attachClean(Astuce instance) {
		log.debug("attaching clean Astuce instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Astuce persistentInstance) {
		log.debug("deleting Astuce instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Astuce merge(Astuce detachedInstance) {
		log.debug("merging Astuce instance");
		try {
			Astuce result = (Astuce) sessionFactory.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Astuce findById(java.lang.Integer id) {
		log.debug("getting Astuce instance with id: " + id);
		try {
			Astuce instance = (Astuce) sessionFactory.getCurrentSession().get("com.appliweb.Neko_Atsume.dao.Astuce",
					id);
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

	public List<Astuce> findByExample(Astuce instance) {
		log.debug("finding Astuce instance by example");
		try {
			@SuppressWarnings("unchecked")
			List<Astuce> results = (List<Astuce>) sessionFactory.getCurrentSession()
					.createCriteria("com.appliweb.Neko_Atsume.dao.Astuce").add(create(instance)).list();
			log.debug("find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}

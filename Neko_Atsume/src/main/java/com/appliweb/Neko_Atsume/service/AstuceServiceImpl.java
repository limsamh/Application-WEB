package com.appliweb.Neko_Atsume.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.appliweb.Neko_Atsume.entities.Astuce;

@Service("astuceService")
@Transactional
public class AstuceServiceImpl implements AstuceService{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	public List<Astuce> findAll() {
		
		return sessionFactory.getCurrentSession().createQuery("from astuce").list();
	}

	public Astuce findById(Integer id) {
		
		return (Astuce) sessionFactory.getCurrentSession().get(Astuce.class, id);
	}

	public void save(Astuce astuce) {
		sessionFactory.getCurrentSession().saveOrUpdate(astuce);
		
	}

}

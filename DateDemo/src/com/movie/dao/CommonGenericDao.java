package com.movie.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("unchecked")
public abstract class CommonGenericDao<C, I extends Serializable> {

	private static final Log log = LogFactory.getLog(CommonGenericDao.class);
	Class<C> entityClass;

	protected Session session;
	protected Transaction tran;

	public CommonGenericDao() {
		session = new Configuration().configure().buildSessionFactory()
				.openSession();
		 entityClass = (Class<C>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		tran = session.beginTransaction();
	}

	public List<C> getAll() {
		try {
			List<C> list = new ArrayList<C>();
			tran.begin();
			list = session.createCriteria(entityClass).list();
			tran.commit();
			return list;
		} catch (HibernateException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	public C get(I id) {
		try {
			return (C) session.get(entityClass, id);
		} catch (HibernateException e) {
			log.error(e.getMessage(), e);
			throw e;
		}
	}

	public void save(C object) {
		try {
			tran.begin();
			session.save(object);
			tran.commit();
			log.info("saved ");
		} catch (HibernateException e) {
			tran.rollback();
			log.error(e.getMessage());
			log.error("Be sure your Database is in read-write mode!");
			throw e;
		}
	}

	public void update(C object) {
		try {
			tran.begin();
			session.update(object);
			tran.commit();

		} catch (HibernateException e) {
			tran.rollback();
			log.error(e.getMessage());
			log.error("Be sure your Database is in read-write mode!");
			throw e;
		}
	}

	public void delete(I id) {
		try {
			tran.begin();
			C actual = get(id);
			session.delete(actual);
			tran.commit();
		} catch (HibernateException e) {
			tran.rollback();
			log.error(e.getMessage());
			log.error("Be sure your Database is in read-write mode!");
			throw e;
		}
	}
}

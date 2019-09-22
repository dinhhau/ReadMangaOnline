package com.aptech.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaQuery;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public abstract class Dao<T> {
    @Autowired
    private  SessionFactory sessionFactory;
    private  Class<T> entityClass;
    private  String entityName;
    @Transactional
    public T save(T entity) {
        sessionFactory.getCurrentSession().save(entity);
        return entity;
    }
    @Transactional
    public void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    public T find(long id) {
        return sessionFactory.getCurrentSession().find(entityClass, id);
    }
    public List<T> list() {
        Session session = sessionFactory.getCurrentSession();
        CriteriaQuery<T> query = session.getCriteriaBuilder().createQuery(entityClass);
        query.select(query.from(entityClass));
        return session.createQuery(query).getResultList();
    }
}

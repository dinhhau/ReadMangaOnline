package com.aptech.dao;

import com.aptech.model.TblUserEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class TblUserDAO  {

    @Autowired
    private  SessionFactory sessionFactory;

    public List<TblUserEntity> list(){
        Session session = null;
        try{
            session = sessionFactory.openSession();
            CriteriaQuery<TblUserEntity> query = session.getCriteriaBuilder().createQuery(TblUserEntity.class);
            query.select(query.from(TblUserEntity.class));
            return session.createQuery(query).getResultList();
        }catch(Exception e)
        {
            e.printStackTrace();
            return new ArrayList<>();
        }finally {
            if(session!=null&&session.isOpen()){
                session.close();
            }
        }

    }
    public void delete(TblUserEntity entity) {
        Session session = null;
        try{
            session = sessionFactory.openSession();
            session.delete(entity);
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            if(session!=null&&session.isOpen()){
                session.close();
            }
        }
    }
    public TblUserEntity save(TblUserEntity entity){
        Session session = null;
        try{
            session = sessionFactory.openSession();
            // Them code o day
            session.save(entity);

        }catch(Exception e)
        {
            entity = null;
            e.printStackTrace();

        }finally {
            if(session!=null&&session.isOpen()){
                session.close();
            }
            return entity;
        }
    }
    public TblUserEntity findById(int userId){
        Session session = null;
        TblUserEntity entity = null;
        try{
            session = sessionFactory.openSession();
            // Them code o day
            entity = session.get(TblUserEntity.class,userId);

        }catch(Exception e)
        {
            e.printStackTrace();
        }finally {
            if(session!=null&&session.isOpen()){
                session.close();
            }
            return entity;
        }

    }
}

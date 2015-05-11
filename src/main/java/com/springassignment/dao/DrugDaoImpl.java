package com.springassignment.dao;

import com.springassignment.models.Drug;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

/**
 * Created by obiero on 5/7/2015.
 */
public class DrugDaoImpl implements DrugDao {
    @Autowired
    SessionFactory sessionFactory;
    @Transactional
    @Override
    public int addDrug(Drug drug) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drug);
        tx.commit();
        Serializable id = session.getIdentifier(drug);
        session.close();
        return (Integer) id;
    }



    @Override
    public List<Drug> listDrug() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drug> drugList = session.createQuery("from Drug").list();
        session.close();
        return drugList;
    }

    @Override
    public Drug getDrugById(int id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Drug.class);
        criteria.add(Restrictions.eq("id", id));
        Drug drug = (Drug) criteria.uniqueResult();
        session.close();
        return drug;
    }


}

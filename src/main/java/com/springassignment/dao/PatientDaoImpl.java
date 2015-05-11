package com.springassignment.dao;

import com.springassignment.models.Patient;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by obiero on 5/6/2015.
 */
@Repository
@SuppressWarnings({"unchecked", "rawtypes"})
public class PatientDaoImpl implements PatientDao{
    @Autowired
    SessionFactory sessionFactory;

    @Transactional
    @Override
    public int addPatient(Patient patient) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(patient);
        tx.commit();
        Serializable id = session.getIdentifier(patient);
        session.close();
        return (Integer) id;
    }



    @Override
    public List<Patient> listPatient() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Patient> patientList = session.createQuery("from Patient").list();
        session.close();
        return patientList;
    }

    @Override
    public Patient getPatientById(int id) {
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Patient.class);
        criteria.add(Restrictions.eq("id", id));
        Patient patient = (Patient) criteria.uniqueResult();
        session.close();
        return patient;
    }



   @Override
    public List<Patient> findAllWithDrugs() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Patient> patientWithDrugList = session.createQuery("from Patient").list();
        session.close();
        return patientWithDrugList;
    }
}

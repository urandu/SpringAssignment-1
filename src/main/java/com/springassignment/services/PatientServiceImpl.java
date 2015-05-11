package com.springassignment.services;

import com.springassignment.dao.PatientDao;
import com.springassignment.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by obiero on 5/6/2015.
 */
public class PatientServiceImpl implements PatientService {
    @Autowired
    PatientDao patientDao;

    @Override
    public int addPatient(Patient patient) {
        return patientDao.addPatient(patient);
    }

    @Override
    public Patient getPatientById(int id) {
        return patientDao.getPatientById(id);
    }

    @Override
    public List<Patient> listPatient() {
        return patientDao.listPatient();
    }

   @Override
    public List<Patient> findAllWithDrugs() {
        return patientDao.findAllWithDrugs();
    }

    @Override
    public int updateRow(Patient patient) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }
}

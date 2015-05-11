package com.springassignment.dao;

/**
 * Created by obiero on 5/6/2015.
 */
import com.springassignment.models.Patient;

import java.util.List;

public interface PatientDao {
    public int addPatient(Patient patient);
    public List<Patient> listPatient();
    public Patient getPatientById(int id);
    public List<Patient> findAllWithDrugs();
}

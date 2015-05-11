package com.springassignment.services;

import com.springassignment.models.Patient;

import java.util.List;

/**
 * Created by obiero on 5/6/2015.
 */
public interface PatientService {
    public int addPatient(Patient patient);

    public Patient getPatientById(int id);

    public List<Patient> listPatient();

    public List<Patient> findAllWithDrugs();

    public int updateRow(Patient patient);

    public int deleteRow(int id);
}

package com.springassignment.services;

import com.springassignment.models.Drug;

import java.util.List;

/**
 * Created by obiero on 5/7/2015.
 */
public interface DrugService {
    public int addDrug(Drug drug);
    public void updateDrug(Drug drug);
    public List<Drug> listDrug();
    public Drug getDrugById(int id);
    public void removeDrug(int id);
}

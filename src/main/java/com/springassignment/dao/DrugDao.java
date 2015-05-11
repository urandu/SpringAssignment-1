package com.springassignment.dao;

import com.springassignment.models.Drug;

import java.util.List;

/**
 * Created by obiero on 5/7/2015.
 */
public interface DrugDao {
    public int addDrug(Drug drug);
    public List<Drug> listDrug();
    public Drug getDrugById(int id);

}

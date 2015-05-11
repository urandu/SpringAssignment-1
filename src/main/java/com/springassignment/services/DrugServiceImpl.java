package com.springassignment.services;

import com.springassignment.dao.DrugDao;
import com.springassignment.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by obiero on 5/7/2015.
 */
public class DrugServiceImpl implements DrugService {
    @Autowired
    DrugDao drugDao;

    @Override
    public int addDrug(Drug drug) {
        return drugDao.addDrug(drug);
    }

    @Override
    public void updateDrug(Drug drug) {

    }

    @Override
    public List<Drug> listDrug() {
        return drugDao.listDrug();
    }

    @Override
    public Drug getDrugById(int id) {
        return drugDao.getDrugById(id);
    }

    @Override
    public void removeDrug(int id) {

    }
}

package com.springassignment.controllers;

import com.springassignment.models.Drug;
import com.springassignment.models.Patient;
import com.springassignment.services.DrugService;
import com.springassignment.services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by obiero on 5/6/2015.
 */
@Controller
public class PatientController {
    @Autowired
    PatientService patientService;
    @Autowired
    DrugService drugService;

    @RequestMapping("/")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","Please Add New Patient Below");
        model.addObject("listPatient", patientService.listPatient());
        model.setViewName("home");

        return model;
    }
    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                               @RequestParam(value = "lname", required = false) String lname,
                               @RequestParam(value = "bdate", required = false) String bdate
    ){
        ModelAndView model = new ModelAndView();


        Patient patient = new Patient();
        patient.setFname(fname);
        patient.setLname(lname);
        patient.setDob(bdate);
        patientService.addPatient(patient);
        model.addObject("listPatient", patientService.listPatient());
        model.addObject("msg","Patient Added Successfully");
        model.setViewName("home");
        return model;
    }
    @RequestMapping(value= "/add_drug", method = RequestMethod.GET)
    public ModelAndView addDrug(@RequestParam(value = "patient_id", required = false) int id){
        ModelAndView model = new ModelAndView("add_drug");
        model.addObject("patient", patientService.getPatientById(id));
        return model;
    }
    @RequestMapping("/save")
    public ModelAndView save(@RequestParam(value = "patient_id", required = false) int pid,
                               @RequestParam(value = "dname", required = false) String dname
    ){
        ModelAndView model = new ModelAndView();
        Drug drug = new Drug();
        drug.setDname(dname);
        drug.setPid(pid);
        drugService.addDrug(drug);
        model.addObject("listDrug", drugService.listDrug());
        model.addObject("msg","Patient Allocated drug Successfully");
        model.setViewName("add_drug");
        return model;
    }
   @RequestMapping("/drug")
    public ModelAndView viewdrugs(){
        ModelAndView model = new ModelAndView();
       List<Drug> drugList = drugService.listDrug();
        model.addObject("drugPatient", drugList);
        model.setViewName("View_drugs");
        return model;
    }
}

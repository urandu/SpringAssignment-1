package com.springassignment.models;


import javax.persistence.*;
/**
 * Created by obiero on 5/7/2015.
 */
@Entity
@Table(name="drug_details")
public class Drug {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="Patient_Id")
    private int pid;

    @Column(name="drug_name")
    private String dname;

    @ManyToOne
    @JoinColumn(name="Patient_Id", insertable=false, updatable = false)
    private Patient patient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getPid(){ return pid; }

    public void setPid(int pid){this.pid = pid; }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }


}

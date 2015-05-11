package com.springassignment.models;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

/**
 * Created by obiero on 5/6/2015.
 */
@Entity
@Table(name="patient_details")
public class Patient {
    @Id
    @GeneratedValue
    private int id;

    @Column(name="first_name")
    private String fname;

    @Column(name="last_name")
    private String lname;

    @Column(name="dob")
    private String dob;

   // @Column(name="time_created")
   // private String datecreated;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Drug> drugs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob(){return dob;}
    public void setDob(String dob){this.dob = dob; }

   /* public String getDatecreated(String datecreated){ return datecreated;}
    public void setDatecreated(String datecreated){this.datecreated = datecreated;}*/

    public List<Drug> getDrug() {
        return drugs;
    }
    public void setDrug(List<Drug> drugs) {
        this.drugs = drugs;
    }

}

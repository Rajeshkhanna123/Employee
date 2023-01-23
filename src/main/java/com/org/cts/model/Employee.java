package com.org.cts.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
@Data
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String address;
    private double pno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPno() {
        return pno;
    }

    public void setPno(double pno) {
        this.pno = pno;
    }
}

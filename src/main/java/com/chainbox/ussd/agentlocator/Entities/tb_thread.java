package com.chainbox.ussd.agentlocator.Entities;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class tb_thread {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    public String msisdn;
    public String cell_id;

    public tb_thread() {
    }

    public tb_thread(String msisdn, String cell_id) {
        this.msisdn = msisdn;
        this.cell_id = cell_id;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public String getCell_id() {
        return cell_id;
    }

    public void setCell_id(String cell_id) {
        this.cell_id = cell_id;
    }
}

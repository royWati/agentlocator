package com.chainbox.ussd.agentlocator.Entities;

import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class tb_transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String msisdn;
    public String cell_id;
    public String LAC;

    @UpdateTimestamp
    public Date timestamp;

    public String CGI;

    public tb_transaction() {
    }

    public tb_transaction(String msisdn,
                          String cell_id, String LAC,
                          String CGI) {
        this.msisdn = msisdn;
        this.cell_id = cell_id;
        this.LAC = LAC;
        this.timestamp = timestamp;
        this.CGI = CGI;
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

    public String getLAC() {
        return LAC;
    }

    public void setLAC(String LAC) {
        this.LAC = LAC;
    }

    public String getCGI() {
        return CGI;
    }

    public void setCGI(String CGI) {
        this.CGI = CGI;
    }
}

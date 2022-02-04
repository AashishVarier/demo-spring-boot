package com.demo.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Entity //annotation tells JPA that this table needs to be created / this is a table
public class CrudModel {

    @Transient //Specifies that the property or field is not persistent. It is used to annotate a property or field of an entity class, mapped superclass, or embeddable class. Becasue I dont want logger as a column in table.
    Logger logger = LoggerFactory.getLogger(CrudModel.class);  //Logger and LoggerFactory are from slf4j lib

    @Id //annotation for primary key
    private Integer id;
    private String msg;

    public CrudModel() { 
        
    }

    //Constructor for intializing them variables
    public CrudModel(Integer id, String msg) {
        this.id = id;
        this.msg = msg;
    }

    // Getter and Setter
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    


    
}

package com.demo.demospringboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //annotation tells JPA that this table needs to be created / this is a table
public class CrudModel {


    @Id //annotation for primary key
    private Integer id;
    private String msg;

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

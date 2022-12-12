package com.demo.demospringboot.service;


import java.sql.SQLException;
import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.demo.demospringboot.model.CrudModel;
import com.demo.demospringboot.repository.demoCrudRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CrudService {

    Logger logger = LoggerFactory.getLogger(CrudService.class);  //Looger and LoggerFactory are from slf4j lib

    @Autowired //for Dependency injection
    private demoCrudRepository crudrepo;
    // Dynamic ArrayList
    // private List<CrudModel> crudList = new ArrayList (
            // Arrays.asList(
                // new CrudModel(1 , "hello"),
                // new CrudModel(2 , "HI")
        // )
    // );

//    Read
    public List<CrudModel> replyMsg (){

        try {
            
        List<CrudModel> crudList = new ArrayList<>();
        crudrepo.findAll().forEach(crudList::add);
        return crudList;

        } catch (SQLException e) {
            e.printStackTrace();
            return List.of();
            
        }

    }

// Create
    public void addMsg(CrudModel crudModel) {

        try {
            
            crudrepo.save(crudModel);

        } catch (SQLException e) {
            e.printStackTrace();
            //TODO: handle exception
        }
       
    }

// Read one value
    public Optional<CrudModel> getMsg(Integer id) {
    //    return crudList.stream().filter(t -> t.getId().equals(id)).findFirst().get();    //used to update to ArrayList . predicate + lamda expresion in Java 8
        
    try {

        return crudrepo.findById(id);

    } catch (SQLException e) {
        e.printStackTrace();
        //TODO: handle exception
    }
    

    }

//Update
public void updateMsg(CrudModel crudModel, Integer id ){
    // update to Arraylist
    // for (int i = 0 ; i< crudList.size(); i++){

        // CrudModel c = crudList.get(i);
        // if (c.getId().equals(id)){
            // crudList.set(i, crudModel);
            // return;
        // }

    // }

    try {
        
        crudrepo.save(crudModel);

    } catch (SQLException e) {
        e.printStackTrace();
        //TODO: handle exception
    }
    
}
//Delete
public void delMsg(Integer id) {


    try {
            
        crudrepo.deleteById(id);

    } catch (SQLException e) {
        e.printStackTrace();
        //TODO: handle exception
    }

    // Delete Arralist
    // crudList.removeIf(t -> t.getId().equals(id));
    // Above Java predicate code does the below stuff
    // for (int i = 0 ; i< crudList.size(); i++){
        // CrudModel c = crudList.get(i);
        // if (c.getId().equals(id)){
            // crudList.remove(i);
        // }}
}
    
}

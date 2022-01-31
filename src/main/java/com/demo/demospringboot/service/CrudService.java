package com.demo.demospringboot.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import com.demo.demospringboot.model.CrudModel;
import com.demo.demospringboot.repository.demoCrudRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CrudService {

    @Autowired
    private demoCrudRepository crudrepo;

    private List<CrudModel> crudList = new ArrayList (
            Arrays.asList(
                new CrudModel(1 , "hello"),
                new CrudModel(2 , "HI")
        )
    );

//    Read
    public List<CrudModel> replyMsg (){
        return crudList;
    }

// Create
    public void addMsg(CrudModel crudModel) {
        crudList.add(crudModel);
    }
// Read one value
    public CrudModel getMsg(Integer id) {
       return crudList.stream().filter(t -> t.getId().equals(id)).findFirst().get();    // predicate + lamda expresion in Java 8
    }
//Update
public void updateMsg(CrudModel crudModel, Integer id ){
    for (int i = 0 ; i< crudList.size(); i++){

        CrudModel c = crudList.get(i);
        if (c.getId().equals(id)){
            crudList.set(i, crudModel);
            return;
        }

    }
    
}

public void delMsg(Integer id) {

    crudList.removeIf(t -> t.getId().equals(id));
    // Above Java predicate code does the below stuff
    // for (int i = 0 ; i< crudList.size(); i++){
        // CrudModel c = crudList.get(i);
        // if (c.getId().equals(id)){
            // crudList.remove(i);
        // }}
}
    
}

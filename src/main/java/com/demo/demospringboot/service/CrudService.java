package com.demo.demospringboot.service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
        List<CrudModel> crudList = new ArrayList<>();
        crudrepo.findAll().forEach(crudList::add);
        return crudList;
    }

// Create
    public void addMsg(CrudModel crudModel) {
       crudrepo.save(crudModel);
    }
// Read one value
    public Optional<CrudModel> getMsg(Integer id) {
    //    return crudList.stream().filter(t -> t.getId().equals(id)).findFirst().get();    // predicate + lamda expresion in Java 8
        return crudrepo.findById(id);

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
    crudrepo.save(crudModel);
}

public void delMsg(Integer id) {
    crudrepo.deleteById(id);
    // Delete Arralit
    // crudList.removeIf(t -> t.getId().equals(id));
    // Above Java predicate code does the below stuff
    // for (int i = 0 ; i< crudList.size(); i++){
        // CrudModel c = crudList.get(i);
        // if (c.getId().equals(id)){
            // crudList.remove(i);
        // }}
}
    
}

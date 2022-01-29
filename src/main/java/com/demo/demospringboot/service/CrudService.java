package com.demo.demospringboot.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.demo.demospringboot.model.CrudModel;

import org.springframework.stereotype.Service;


@Service
public class CrudService {

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
    
}

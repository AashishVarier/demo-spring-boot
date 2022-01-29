package com.demo.demospringboot.controller;

import java.util.List;

import com.demo.demospringboot.model.CrudModel;
import com.demo.demospringboot.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CrudController {

    @Autowired
    private CrudService crudService;
    
    //Create
    @PostMapping("/msg")
    public void addMsg (@RequestBody CrudModel crudModel) {
        crudService.addMsg(crudModel);

    }

    // Read and return a List
    @GetMapping("/msg")
    public List<CrudModel> replyMsg (){
        return crudService.replyMsg();
    }

    // Update

    // Delete


}

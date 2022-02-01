package com.demo.demospringboot.controller;

import java.util.List;
import java.util.Optional;

import com.demo.demospringboot.model.CrudModel;
import com.demo.demospringboot.service.CrudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    // Read a return specific msg
    @GetMapping("/msg/{id}")
    public Optional<CrudModel> getMsg(@PathVariable Integer id ){  
        return crudService.getMsg(id);
    }

    // Update
    @PutMapping("/msg/{id}")
    public void updateMsg(@RequestBody CrudModel crudModel, @PathVariable Integer id ){  
        crudService.updateMsg(crudModel, id);
    }


    // Delete
    @DeleteMapping("/msg/{id}")
    public void delMsg( @PathVariable Integer id ){  
        crudService.delMsg(id);
    }


}

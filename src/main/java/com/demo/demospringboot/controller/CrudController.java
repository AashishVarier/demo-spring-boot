package com.demo.demospringboot.controller;

import java.util.List;
import java.util.Optional;

import com.demo.demospringboot.model.CrudModel;
import com.demo.demospringboot.service.CrudService;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController //@Controller + @ResponseBody (@ResponseBody = method return value should be bound to the webresponse body)
public class CrudController {
    
    Logger logger = LoggerFactory.getLogger(CrudController.class); //Looger and LoggerFactory are from slf4j lib

    @Autowired //for Dependency injection
    private CrudService crudService;
    
    //Create
    @PostMapping("/msg")
    public void addMsg (@RequestBody CrudModel crudModel) {
        crudService.addMsg(crudModel);

    }

    // Read and return a List
    @GetMapping("/msg")
    public List<CrudModel> replyMsg (){


        logger.debug("Debug from get"); // seen from when logging.level.root = DEBUG in application.properties ie: not seen when logging.level.root = TRACE or INFO or WARN or ERROR
        logger.trace("trace form get"); //seen from when logging.level.root = DEBUG or TRACE in application.properties ie: not seen when logging.level.root =  INFO or WARN or ERROR
        logger.info("info form get"); //seen  from when logging.level.root = DEBUG or TRACE or INFO in application.properties ie: not seen when logging.level.root = WARN or ERROR 
        logger.warn("warn form get"); //seen  from when logging.level.root = DEBUG or TRACE or INFO or WARN in application.properties ie: not seen when logging.level.root = ERROR
        logger.error("error form get", crudService.replyMsg()); //seen from when logging.level.root = DEBUG or TRACE or INFO or WARN or ERROR in application.properties


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

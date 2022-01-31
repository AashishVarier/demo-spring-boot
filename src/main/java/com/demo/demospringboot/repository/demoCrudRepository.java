package com.demo.demospringboot.repository;

import com.demo.demospringboot.model.CrudModel;

import org.springframework.data.repository.CrudRepository;

public interface  demoCrudRepository extends CrudRepository <CrudModel, Integer>{

    
}

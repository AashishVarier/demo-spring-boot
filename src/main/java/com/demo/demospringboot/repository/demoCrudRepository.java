package com.demo.demospringboot.repository;

import com.demo.demospringboot.model.CrudModel;

import org.springframework.data.repository.CrudRepository;

public interface  demoCrudRepository extends CrudRepository <CrudModel, Integer>{

    // CrudRepository: Interface for generic CRUD operations on a repository for a specific type
}

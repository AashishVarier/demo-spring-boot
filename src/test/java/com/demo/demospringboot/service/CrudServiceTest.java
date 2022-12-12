package com.demo.demospringboot.service;

import com.demo.demospringboot.repository.demoCrudRepository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class) //used to load Junit 5 extention. Here its Mockito.
public class CrudServiceTest {

    @Mock //creates mock implementation of the variable. Here of repository
    demoCrudRepository repository;

    @InjectMocks //Injects the created mock variable into the class. Here its a service class
    CrudService service;


    @Test
    void testAddMsg() {

        //setup mock secinario

        //execute service using the mock secinario

        //validate

    }

    @Test
    void testDelMsg() {

        //setup mock secinario

        //execute service using the mock secinario

        //validate
    }

    @Test
    void testGetMsg() {

        //setup mock secinario

        //execute service using the mock secinario

        //validate
    }

    @Test
    void testReplyMsg() {

        //setup mock secinario

        //execute service using the mock secinario

        //validate
    }

    @Test
    void testUpdateMsg() {

        //setup mock secinario

        //execute service using the mock secinario

        //validate
    }
}

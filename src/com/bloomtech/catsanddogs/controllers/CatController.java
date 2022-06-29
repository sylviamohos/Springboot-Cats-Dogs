package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.CatRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Tell the server there are controllers in this file to handle URLs - you can have as many as you want.
public class CatController
{
    private CatRepository catRepo = new CatRepository();

    // @GetMapping tells the server that when you get an HTTP GET request for the path specified
    //      run this method.
    // @GetMapping says: "Run this method when you receive a GET request with the path /cats"
    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs() // the name of this method doesn't matter - its not used anywhere.
    {
        // adding the sout to see what is happening:
        System.out.println("GET with the path /cats was received.");
        return new ResponseEntity<>(catRepo.getCats(), HttpStatus.OK);

    }
}

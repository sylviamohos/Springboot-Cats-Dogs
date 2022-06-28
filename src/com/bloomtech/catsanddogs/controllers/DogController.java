package com.bloomtech.catsanddogs.controllers;

import com.bloomtech.catsanddogs.repositories.DogRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// When a server receives an HTTP request, it includes a URL that tells the server what you want to do.




@RestController // Tell the server there are controllers in this file to handle URLs - you can have as many as you want.
public class DogController
{
    private DogRepository dogRepos = new DogRepository();

    // @GetMapping tells the server that when you get an HTTP GET request for the path specified
    //      run this method.
    // @GetMapping says: "Run this method when you receive a GET request with the path /dogs"
    @GetMapping(value = "/dogs", produces = {"application/json"})
    public ResponseEntity<?> findAllDogs()
    {
        // adding the sout to see what is happening:
        System.out.println("GET with the path /dogs was received.");
        return new ResponseEntity<>(dogRepos.getDogs(), HttpStatus.OK);
    }
}

package com.example.week14hw.fileFolder.controllers;

import com.example.week14hw.fileFolder.models.Person;
import com.example.week14hw.fileFolder.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons(){
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/persons/{id}")
    public ResponseEntity getPersonById(@PathVariable Long id){
        return new ResponseEntity(personRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping("/persons")
    public ResponseEntity<Person> postPerson(@RequestBody Person person){
        personRepository.save(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

    @DeleteMapping("/persons/{id}")
    public ResponseEntity<Long> deletePerson(@PathVariable(value = "id") Long id){
        personRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}

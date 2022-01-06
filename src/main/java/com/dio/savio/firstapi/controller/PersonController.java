package com.dio.savio.firstapi.controller;

import com.dio.savio.firstapi.dto.response.MessageResponseDTO;
import com.dio.savio.firstapi.entity.Person;
import com.dio.savio.firstapi.repository.PersonRepository;
import com.dio.savio.firstapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}

package com.dio.savio.firstapi.service;

import com.dio.savio.firstapi.dto.response.MessageResponseDTO;
import com.dio.savio.firstapi.entity.Person;
import com.dio.savio.firstapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Service: Created person with ID " + savedPerson.getId())
                .build();
    }
}

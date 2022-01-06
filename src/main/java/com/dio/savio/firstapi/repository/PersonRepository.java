package com.dio.savio.firstapi.repository;

import com.dio.savio.firstapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

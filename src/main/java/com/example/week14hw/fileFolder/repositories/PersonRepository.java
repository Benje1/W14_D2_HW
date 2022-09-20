package com.example.week14hw.fileFolder.repositories;

import com.example.week14hw.fileFolder.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}

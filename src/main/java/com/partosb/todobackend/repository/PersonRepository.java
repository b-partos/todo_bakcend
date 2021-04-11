package com.partosb.todobackend.repository;

import com.partosb.todobackend.model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {

    <S extends Person> S save(S entity);

    Optional<Person> findById(Long aLong);

    Optional<Person> findByUserName(String userName);

    void deleteById(Long aLong);

}

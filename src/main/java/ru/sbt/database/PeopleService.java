package ru.sbt.database;


import ru.sbt.model.People;

import java.util.List;

public class PeopleService {

    private final PeopleRepository repository;

    public PeopleService(PeopleRepository repository) {
        this.repository = repository;
    }

    public List<People> findAll() {
        return repository.findAll();
    }
}

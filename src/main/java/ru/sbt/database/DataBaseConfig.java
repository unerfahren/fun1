package ru.sbt.database;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseConfig {

    @Bean
    public PeopleService peopleService(PeopleRepository repository) {
        repository.findAll().forEach(System.err::println);
        return new PeopleService(repository);
    }
}
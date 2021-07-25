package ru.sbt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sbt.database.PeopleService;
import ru.sbt.model.People;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private final PeopleService peopleService;

    @Autowired
    public TestController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping
    public String getAllDate() {
        List<People> all = peopleService.findAll();
        return all.toString();
    }
}

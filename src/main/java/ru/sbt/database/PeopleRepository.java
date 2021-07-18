package ru.sbt.database;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.sbt.model.People;

public interface PeopleRepository extends JpaRepository<People, Long> {
}

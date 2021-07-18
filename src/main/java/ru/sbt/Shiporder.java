package ru.sbt;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.sbt.model.People;

import java.util.List;

@Data
@NoArgsConstructor
public class Shiporder {
    List<People> peoples;
}

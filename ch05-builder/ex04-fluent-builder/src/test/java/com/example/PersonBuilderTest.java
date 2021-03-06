package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class PersonBuilderTest {

    @Test
    void create_default_person() {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder.build();

        String details = "Name: No Name\n"
                        + "Title: No Title\n"
                        + "Age: 28\n"
                        + "Salary: 10000.0";

        assertEquals(details, person.toString());
    }

    @Test
    void create_person_with_name() {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder.withName("Tushar")
                                .build();

        String details = "Name: Tushar\n"
                        + "Title: No Title\n"
                        + "Age: 28\n"
                        + "Salary: 10000.0";

        assertEquals(details, person.toString());
    }

    @Test
    void create_person_full() {
        PersonBuilder builder = new PersonBuilder();
        Person person = builder
                            .withSalary(34000)
                            .withName("Tushar")
                            .withTitle("Architect")
                            .withAge(19)
                            .build();

        String details = "Name: Tushar\n"
                        + "Title: Architect\n"
                        + "Age: 19\n"
                        + "Salary: 34000.0";

        assertEquals(details, person.toString());
    }

}
package com.rv.collections.streamsandmaps.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Actor extends Person {
    private ActingCategory actingCategory;

    @Builder
    public Actor(
            String name,
            String firstName,
            String middleName,
            String lastName,
            int debutYear,
            int age,
            ActingCategory actingCategory) {
        super(name, firstName, middleName, lastName, debutYear, age);
        this.actingCategory = actingCategory;
    }

    public void printActor() {
        System.out.println("***********Actor**********");
        System.out.printf("Name: %s\n", this.firstName + " " + this.lastName);
        System.out.printf("DebutYear: %d\n", debutYear);
        System.out.printf("Age: %d\n", age);
        System.out.println("**************************");
    }
}

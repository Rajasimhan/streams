package com.rv.collections.streamsandmaps.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Director extends Person {
    @Builder
    public Director(String name,
                    String firstName,
                    String middleName,
                    String lastName,
                    int debutYear,
                    int age) {
        super(name, firstName, middleName, lastName, debutYear, age);
    }

    public void printActor() {
        System.out.println("***********Director**********");
        System.out.printf("Name: %s\n", this.firstName + " " + this.lastName);
        System.out.printf("Debut Year: %d\n", debutYear);
        System.out.printf("Age: %d\n", age);
        System.out.println("**************************");
    }

}


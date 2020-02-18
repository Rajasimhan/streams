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

}


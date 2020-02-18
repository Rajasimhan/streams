package com.rv.collections.streamsandmaps.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@EqualsAndHashCode
public class Person {
    public String name;
    public String firstName;
    public String middleName;
    public String lastName;
    public int debutYear;
    public int age;
}

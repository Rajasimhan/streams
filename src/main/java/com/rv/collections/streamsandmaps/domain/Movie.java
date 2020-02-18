package com.rv.collections.streamsandmaps.domain;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Movie {
    private String title;
    private Director director;
    private int yearOfRelease;
    private List<Actor> cast;
}

package com.rv.collections.streamsandmaps;

import com.rv.collections.streamsandmaps.domain.ActingCategory;
import com.rv.collections.streamsandmaps.domain.Actor;
import com.rv.collections.streamsandmaps.domain.Director;
import com.rv.collections.streamsandmaps.domain.Movie;

import java.util.Arrays;
import java.util.List;

public class DataUtil {
    public static List<Movie> getMovies() {
        return Arrays.asList(
                Movie.builder()
                        .title("Jurassic Park")
                        .yearOfRelease(1992)
                        .director(Director.builder()
                                .age(74)
                                .debutYear(1978)
                                .firstName("Stephen")
                                .lastName("Spielberg")
                                .name("ssb")
                                .build())
                        .cast(
                                Arrays.asList(
                                        Actor.builder()
                                                .age(74)
                                                .debutYear(1979)
                                                .firstName("Jeff")
                                                .lastName("Goldblum")
                                                .name("jg")
                                                .actingCategory(ActingCategory.SUPPORT).build(),
                                        Actor.builder()
                                                .age(74)
                                                .debutYear(1980)
                                                .firstName("Sam")
                                                .lastName("Neil")
                                                .name("sn")
                                                .actingCategory(ActingCategory.HERO).build()
                                )
                        ).build(),
                Movie.builder()
                        .title("The Lost World")
                        .yearOfRelease(1994)
                        .director(Director.builder()
                                .age(74)
                                .debutYear(1978)
                                .firstName("Stephen")
                                .lastName("Spielberg")
                                .name("ssb")
                                .build())
                        .cast(
                                Arrays.asList(
                                        Actor.builder()
                                                .age(74)
                                                .debutYear(1979)
                                                .firstName("Jeff")
                                                .lastName("Goldblum")
                                                .name("jg")
                                                .actingCategory(ActingCategory.HERO).build(),
                                        Actor.builder()
                                                .age(74)
                                                .debutYear(1990)
                                                .firstName("Julianne")
                                                .lastName("Moore")
                                                .name("jm")
                                                .actingCategory(ActingCategory.HEROINE).build()
                                )
                        ).build(),
                Movie.builder()
                        .title("Inception")
                        .yearOfRelease(2011)
                        .director(Director.builder()
                                .age(43)
                                .debutYear(1999)
                                .firstName("Christopher")
                                .lastName("Nolan")
                                .name("JN")
                                .build())
                        .cast(
                                Arrays.asList(
                                        Actor.builder()
                                                .age(42)
                                                .debutYear(1990)
                                                .firstName("Leo")
                                                .lastName("Di-Cap")
                                                .name("ld")
                                                .actingCategory(ActingCategory.HERO).build(),
                                        Actor.builder()
                                                .age(79)
                                                .debutYear(154)
                                                .firstName("Michael")
                                                .lastName("Caine")
                                                .name("mc")
                                                .actingCategory(ActingCategory.SUPPORT).build()
                                )
                        ).build()
        );
    }
}

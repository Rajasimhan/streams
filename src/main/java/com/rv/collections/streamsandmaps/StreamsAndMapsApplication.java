package com.rv.collections.streamsandmaps;

import com.rv.collections.streamsandmaps.domain.Actor;
import com.rv.collections.streamsandmaps.domain.Director;
import com.rv.collections.streamsandmaps.domain.Movie;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamsAndMapsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamsAndMapsApplication.class, args);
        customStreamCollectorExample();
        filterExample();
        sortExample();
        sortReverseOrderExample();
    }

    private static void customStreamCollectorExample() {
        DataUtil.getMovies().stream()
                .flatMap(movie -> movie.getCast().stream())
                .collect(HashMap<String, Actor>::new, (m, e) -> m.put(e.name, e), Map::putAll)
                .values()
                .stream()
                .peek(Actor::printActor)
                .collect(Collectors.toList());
    }

    private static void filterExample() {
        DataUtil.getMovies().stream()
                .filter(movie -> movie.getDirector().age < 70)
                .map(movie -> movie.getDirector())
                .peek(Director::printActor)
                .count();
    }

    private static void sortExample() {
        System.out.println("***********************************");
        System.out.println("Sorting based on movie release year");
        System.out.println("***********************************");
        DataUtil.getMovies().stream()
                .sorted(Comparator.comparing(Movie::getYearOfRelease))
                .map(movie -> "Title: " + movie.getTitle() + " | " + "Year of Release: " + movie.getYearOfRelease()).peek(System.out::println)
                .collect(Collectors.toList());
    }


    private static void sortReverseOrderExample() {
        System.out.println("****************************************************");
        System.out.println("Sorting based on movie release year in reverse order");
        System.out.println("****************************************************");
        DataUtil.getMovies().stream()
                .sorted(Comparator.comparing(Movie::getYearOfRelease).reversed())
                .map(movie -> "Title: " + movie.getTitle() + " | " + "Year of Release: " + movie.getYearOfRelease()).peek(System.out::println)
                .collect(Collectors.toList());
    }

}

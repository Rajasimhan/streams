package com.rv.collections.streamsandmaps;

import com.rv.collections.streamsandmaps.domain.Actor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@SpringBootApplication
public class StreamsAndMapsApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamsAndMapsApplication.class, args);
        DataUtil.getMovies().stream()
                .flatMap(movie -> movie.getCast().stream())
                .collect(HashMap<String, Actor>::new, (m, e) -> m.put(e.name, e), Map::putAll)
                .values()
                .stream()
                .peek(Actor::printActor)
                .collect(Collectors.toList());
    }
}

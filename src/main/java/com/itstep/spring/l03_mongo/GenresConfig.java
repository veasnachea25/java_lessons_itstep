package com.itstep.spring.l03_mongo;

import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class GenresConfig {
    private int distanceBetweenWarehouses = 20;//km

    private List<Role> genres = Arrays.asList(
            new Role("1" , "Maintainer"),
            new Role("2" , "Committer")
    );

    public List<Role> getGenres() {
        return Collections.unmodifiableList(genres);
    }
}

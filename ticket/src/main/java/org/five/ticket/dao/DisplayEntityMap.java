package org.five.ticket.dao;

import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.five.ticket.entity.content.Movie;
import org.five.ticket.entity.display.DisplayEntity;
import org.five.ticket.entity.display.MovieDisplay;
import org.five.ticket.entity.location.DisplayLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DisplayEntityMap {

    @Autowired
    @Qualifier("movieMap1")
    private Map<String, Movie> movieMap;

    @Autowired
    @Qualifier("movieDisplayLocationMap")
    private Map<String, DisplayLocation> movieDisplayLocationMap;

    @Bean("movieDisplayMap")
    public Map<String, DisplayEntity> movieDisplayMap()
    {
        ConcurrentHashMap<String, DisplayEntity> movieDisplayMap = new ConcurrentHashMap<>();
        movieDisplayLocationMap.forEach((locationKey,locationVal)->{
            movieMap.forEach((movieKey,movieVal)->{
                MovieDisplay movieDisplay = new MovieDisplay(UUID.randomUUID().toString(), "电影", locationVal, new BigDecimal(33), 50, movieVal);
                movieDisplayMap.put(movieDisplay.getUuid(),movieDisplay);

            });
        });
        return movieDisplayMap;
    }
}

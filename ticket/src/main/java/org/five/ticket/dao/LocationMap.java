package org.five.ticket.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.five.ticket.entity.location.DisplayLocation;
import org.springframework.context.annotation.Bean;

public class LocationMap {

    @Bean("movieDisplayLocationMap")
    public Map<String, DisplayLocation> movieDisplayLocationMap()
    {
        ConcurrentHashMap<String, DisplayLocation> movieDisplayLocationMap = new ConcurrentHashMap<>();
        return movieDisplayLocationMap;
    }
}

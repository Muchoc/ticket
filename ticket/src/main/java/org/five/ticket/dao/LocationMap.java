package org.five.ticket.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import org.five.ticket.entity.location.DisplayLocation;
import org.five.ticket.entity.location.movie.MovieDisplayLocation;
import org.five.ticket.entity.location.movie.ScreeningRoom;
import org.five.ticket.entity.location.movie.Seat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocationMap {

    @Bean("movieDisplayLocationMap")
    public Map<String, DisplayLocation> movieDisplayLocationMap()
    {
        ConcurrentHashMap<String, DisplayLocation> movieDisplayLocationMap = new ConcurrentHashMap<>();
        Seat seat = new Seat(UUID.randomUUID().toString(), 1, 1, (byte)0);
        ScreeningRoom screeningRoom = new ScreeningRoom(UUID.randomUUID().toString(), "VIP巨幕", "伯号厅", Arrays.asList(seat));
        ArrayList<ScreeningRoom> screeningRoomList = new ArrayList<>();
        screeningRoomList.add(screeningRoom);
        DisplayLocation movieDisplayLocation = new MovieDisplayLocation(UUID.randomUUID().toString(),"江苏","南京","大地院线","江宁区景枫大厦4层",screeningRoomList);
        movieDisplayLocationMap.put(movieDisplayLocation.getUuid(),movieDisplayLocation);
        return movieDisplayLocationMap;
    }
}

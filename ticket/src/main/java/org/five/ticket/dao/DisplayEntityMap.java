package org.five.ticket.dao;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.five.ticket.entity.display.DisplayEntity;
import org.five.ticket.entity.display.MovieDisplay;

public class DisplayEntityMap {

    public Map<String, DisplayEntity> movieDisplayMap()
    {
        ConcurrentHashMap<String, DisplayEntity> movieDisplayMap = new ConcurrentHashMap<>();
        MovieDisplay movieDisplay = new MovieDisplay();
        return movieDisplayMap;
    }
}

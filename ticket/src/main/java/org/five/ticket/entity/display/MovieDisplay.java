package org.five.ticket.entity.display;

import java.math.BigDecimal;
import lombok.Data;
import org.five.ticket.entity.content.Movie;
import org.five.ticket.entity.location.DisplayLocation;

public class MovieDisplay extends DisplayEntity {
    private Movie movie;

    public MovieDisplay(String uuid, String displayType, DisplayLocation displayLocation, BigDecimal price, Integer ticketNum,Movie movie) {
        super(uuid, displayType, displayLocation, price, ticketNum);
        this.movie = movie;
    }
}

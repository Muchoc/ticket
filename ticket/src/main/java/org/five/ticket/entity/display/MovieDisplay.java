package org.five.ticket.entity.display;

import lombok.Data;
import org.five.ticket.entity.content.Movie;

@Data
public class MovieDisplay extends DisplayEntity {
    private Movie movie;

}

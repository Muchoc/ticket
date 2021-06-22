package org.five.ticket.entity.location.movie;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ScreeningRoom {
    private String uuid;
    private String Type;
    private String name;
    private List<Seat> seatList;

}

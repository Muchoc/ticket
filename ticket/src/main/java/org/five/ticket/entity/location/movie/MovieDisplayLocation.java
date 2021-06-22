package org.five.ticket.entity.location.movie;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.five.ticket.entity.location.DisplayLocation;

public class MovieDisplayLocation extends DisplayLocation {
    private List<ScreeningRoom> screeningRoomList;

    public MovieDisplayLocation(String uuid, String province, String city, String name, String locationInfo,List<ScreeningRoom> screeningRoomList) {
        super(uuid, province, city, name, locationInfo);
        this.screeningRoomList = screeningRoomList;
    }
}

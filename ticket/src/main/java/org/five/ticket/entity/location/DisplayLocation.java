package org.five.ticket.entity.location;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DisplayLocation {
    private String uuid;
    private String province;
    private String city;
    private String name;
    private String locationInfo;

}

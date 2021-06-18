package org.five.ticket.entity.display;

import java.math.BigDecimal;
import lombok.Data;
import org.five.ticket.entity.location.DisplayLocation;

@Data
public class DisplayEntity {
    private String uuid;
    private String displayType;
    private DisplayLocation displayLocation;
    private BigDecimal price;
    private Integer ticketNum;


}

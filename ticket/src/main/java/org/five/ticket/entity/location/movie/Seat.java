package org.five.ticket.entity.location.movie;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Seat {
    private String uuid;
    private Integer row;
    private Integer column;
    private byte isUsed;//是否在使用中


}

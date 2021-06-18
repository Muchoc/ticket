package org.five.ticket.entity.ticket;

import java.util.Date;
import lombok.Data;
import org.five.ticket.entity.display.DisplayEntity;
import org.five.ticket.entity.user.User;

@Data
public class TicketEntity {
    private String uuid;
    private DisplayEntity displayEntity;
    private User user; //属于哪个用户
    private Date createTime;//创建时间
}

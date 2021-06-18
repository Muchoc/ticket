package org.five.ticket.service.bulider.ticket;

import org.five.ticket.entity.ticket.TicketEntity;
import org.five.ticket.vo.TicketVo;

public  abstract class AbstractTicketBulider {

    public abstract TicketEntity buildTicket(TicketVo ticketVo);





}

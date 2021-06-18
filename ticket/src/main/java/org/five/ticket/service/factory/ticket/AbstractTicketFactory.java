package org.five.ticket.service.factory.ticket;

import org.five.ticket.entity.ticket.TicketEntity;
import org.five.ticket.vo.TicketVo;

//抽象票工厂
public abstract class AbstractTicketFactory {

    public abstract TicketEntity produceTicket(TicketVo ticketVo);



}

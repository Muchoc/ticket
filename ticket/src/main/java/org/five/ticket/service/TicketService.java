package org.five.ticket.service;

import org.five.ticket.entity.ticket.TicketEntity;
import org.five.ticket.vo.TicketVo;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public TicketEntity bulidTicket(TicketVo ticketVo)
    {
        return new TicketEntity();
    }

}

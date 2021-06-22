package org.five.ticket;

import java.util.concurrent.ConcurrentHashMap;
import org.five.ticket.entity.display.DisplayEntity;
import org.five.ticket.entity.display.MovieDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TicketMain {


    public static void main(String[] args) {
        SpringApplication.run(TicketMain.class, args);
    }
}

package org.five.ticket.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.five.ticket.entity.content.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MovieMap {


    @Bean("movieMap1")
    public Map<String, Movie> movieMap()
    {
        HashMap<String, Movie> movieMap = new HashMap<>();
        Movie sawadika = new Movie(UUID.randomUUID().toString(),"爱情","萨瓦迪卡","张大炮/斯内克",new Date());
        movieMap.put(sawadika.getUuid(), sawadika);
        return movieMap;
    }


}

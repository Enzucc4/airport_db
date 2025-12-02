package com.example.airport_manager;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api")
public class Flights {

    @Autowired
    private MongoTemplate mongoTemplate;

    // API per vedere un volo specifico tramite scheduledFlightNumber
    @GetMapping("/flights/{flightNumber}")
    public Document getVoloSingolo(@PathVariable String flightNumber) {
        Query query = new Query(Criteria.where("scheduledFlightNumber").is(flightNumber));
        Document volo = mongoTemplate.findOne(query, Document.class, "operational_flights");

        if (volo == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Volo non trovato: " + flightNumber);
        }

        return volo;
    }
}

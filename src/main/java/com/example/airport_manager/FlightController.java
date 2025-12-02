package com.example.airport_manager; // Assicurati che questo package sia giusto

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api") // Questo è l'indirizzo base
public class FlightController {

    @Autowired
    private MongoTemplate mongoTemplate; // Strumento magico per parlare con Mongo

    // 1. API per vedere tutti i voli operativi
    @GetMapping("/operational_flights")
    public List<Document> getVoli() {
        // "Vammi a prendere tutto quello che c'è nella collection operational_flights"
        return mongoTemplate.findAll(Document.class, "operational_flights");
    }

}
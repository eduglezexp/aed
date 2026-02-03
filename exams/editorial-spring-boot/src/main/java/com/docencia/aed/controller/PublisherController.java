package com.docencia.aed.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docencia.aed.entity.Publisher;
import com.docencia.aed.service.IPublisherService;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@RestController
@RequestMapping(name = "/api")
public class PublisherController {

    private final IPublisherService publisherService;

    public PublisherController(IPublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/publishers")
    public List<Publisher> getAllPublishers() {
        return publisherService.findAll();
    }

    @GetMapping("/publishers/{id}")
    public ResponseEntity<Publisher> gePublisherById(int id) {
        Publisher publisher = publisherService.findById(id);
        if (publisher == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(publisher);
    }

    @PostMapping("/publishers")
    public ResponseEntity<Publisher> savePublisher(Publisher publisher) {
        if (publisher == null) {
            return ResponseEntity.badRequest().build();
        }
        publisherService.create(publisher);
        return ResponseEntity.ok(publisher);
    }
}

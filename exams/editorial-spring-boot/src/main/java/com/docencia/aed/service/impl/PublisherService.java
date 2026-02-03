package com.docencia.aed.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.docencia.aed.entity.Publisher;
import com.docencia.aed.repository.PublisherJpaRepository;
import com.docencia.aed.service.IPublisherService;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Service
public class PublisherService implements IPublisherService {

    private final PublisherJpaRepository repository;

    public PublisherService(PublisherJpaRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Publisher> findAll() {
        return repository.findAll();
    }

    @Override
    public Publisher findById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Publisher create(Publisher publisher) {
        if (publisher == null) {
            return null;
        }
        return repository.save(publisher);
    }
}

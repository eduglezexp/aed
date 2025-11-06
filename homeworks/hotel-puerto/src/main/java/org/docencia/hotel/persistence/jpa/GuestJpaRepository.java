package org.docencia.hotel.persistence.jpa;

import java.util.List;
import java.util.UUID;

import org.docencia.hotel.model.Guest;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.docencia.hotel.repository.IGuestRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class GuestJpaRepository extends AbstractJpaRepository<Guest, String> {

    private final IGuestRepository repository;

    /**
     * Constructor por defecto
     */
    public GuestJpaRepository(IGuestRepository repository) {
        super(Guest.class);
        this.repository = repository;
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public Guest findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Guest> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Guest save(Guest guest) {
        if (guest.getId() == null || guest.getId().isBlank()) {
            guest.setId(UUID.randomUUID().toString());
        }
        return repository.save(guest);
    }

    @Override
    @Transactional
    public boolean deleteById(String id) {
        if (!repository.existsById(id)) {
            return false;
        }
        repository.deleteById(id);
        return true;
    }
}

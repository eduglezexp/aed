package org.docencia.hotel.persistence.jpa;

import java.util.List;
import java.util.UUID;

import org.docencia.hotel.model.Hotel;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.docencia.hotel.repository.IHotelRepository;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class HotelJpaRepository extends AbstractJpaRepository<Hotel, String> {

    private final IHotelRepository repository;

    /**
     * Constructor por defecto
     */
    public HotelJpaRepository(IHotelRepository repository) {
        this.repository = repository;
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public Hotel findById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Hotel> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Hotel save(Hotel hotel) {
        if (hotel.getId() == null || hotel.getId().isBlank()) {
            hotel.setId(UUID.randomUUID().toString());
        }
        return repository.save(hotel);
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

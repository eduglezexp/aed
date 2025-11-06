package org.docencia.hotel.persistence.jpa;

import java.util.List;

import org.docencia.hotel.model.Hotel;
import org.docencia.hotel.repository.IHotelRepository;
import org.springframework.stereotype.Repository;

@Repository
public class HotelJpaRepository extends AbstractJpaRepository<Hotel, String> implements IHotelRepository {

    public HotelJpaRepository() {
        super(Hotel.class);
    }

    @Override
    public boolean existsById(String id) {
        return super.existsById(id);
    }

    @Override
    public Hotel findById(String id) {
        return super.findById(id);
    }

    @Override
    public List<Hotel> findAll() {
        return super.findAll();
    }

    @Override
    public Hotel save(Hotel hotel) {
        return super.save(hotel);
    }

    @Override
    public boolean deleteById(String id) {
        return super.deleteById(id);
    }
}

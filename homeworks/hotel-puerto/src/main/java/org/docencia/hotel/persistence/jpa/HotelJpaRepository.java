package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Hotel;
import org.docencia.hotel.repository.IHotelRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class HotelJpaRepository extends AbstractJpaRepository<Hotel, String> implements IHotelRepository {

    public HotelJpaRepository() {
        super(Hotel.class);
    }
}

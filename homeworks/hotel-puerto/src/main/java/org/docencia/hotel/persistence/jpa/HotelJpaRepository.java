package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Hotel;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.docencia.hotel.repository.IHotelRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class HotelJpaRepository extends AbstractJpaRepository<Hotel, String> implements IHotelRepository {

    /**
     * Constructor por defecto
     */
    public HotelJpaRepository() {
        super(Hotel.class);
    }
}

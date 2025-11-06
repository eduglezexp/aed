package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Guest;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.docencia.hotel.repository.IGuestRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class GuestJpaRepository extends AbstractJpaRepository<Guest, String> {

    /**
     * Constructor por defecto
     */
    public GuestJpaRepository() {
        super(Guest.class);
    }
}

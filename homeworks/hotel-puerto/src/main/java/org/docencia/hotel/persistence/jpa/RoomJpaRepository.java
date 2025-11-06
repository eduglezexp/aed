package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.repository.IRoomRepository;
import org.docencia.hotel.model.Room;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class RoomJpaRepository extends AbstractJpaRepository<Room, String> {

    private final IRoomRepository repository;

    /**
     * Constructor por defecto
     */
    public RoomJpaRepository() {
        super(Room.class);
    }



    public IRoomRepository getRepository() {
        return repository;
    }
}

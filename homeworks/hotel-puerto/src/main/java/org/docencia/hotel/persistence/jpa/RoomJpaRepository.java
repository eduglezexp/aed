package org.docencia.hotel.persistence.jpa;

import java.util.List;

import org.docencia.hotel.model.Room;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.docencia.hotel.repository.IRoomRepository;
import org.springframework.stereotype.Repository;


/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class RoomJpaRepository extends AbstractJpaRepository<Room, String> {

    private final IRoomRepository repository;

    public RoomJpaRepository(IRoomRepository repository) {
        this.repository = repository;
    }
    
    /**
     * Metodo para obtener una hotel dada su id
     * @param hotelId indentificador del hotel
     * @return una lista de habitaciones
     */
    List<Room> findByHotelId(String hotelId) {
        return repository.findByHotelId(hotelId);
    }
}

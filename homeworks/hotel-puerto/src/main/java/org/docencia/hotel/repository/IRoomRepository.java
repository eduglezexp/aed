package org.docencia.hotel.repository;

import org.docencia.hotel.model.Room;
import org.docencia.hotel.repository.interfaces.IJpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface IRoomRepository extends IJpaRepository<Room, String> {

    /**
     * Metodo para obtener una hotel dada su id
     * @param hotelId indentificador del hotel
     * @return una lista de habitaciones
     */
    List<Room> findByHotelId(String hotelId);
}

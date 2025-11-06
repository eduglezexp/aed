package org.docencia.hotel.repository;

import org.docencia.hotel.model.Room;
import org.docencia.hotel.repository.interfaces.ICrudRepository;

import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IRoomRepository extends ICrudRepository<Room> {
    List<Room> findByHotelId(String hotelId);
}

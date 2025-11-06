package org.docencia.hotel.repository;

import org.docencia.hotel.model.Room;
import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IRoomRepository {
    boolean existsById(String id);
    Room findById(String id);
    List<Room> findAll();
    Room save(Room room);
    boolean deleteById(String id);
    List<Room> findByHotelId(String hotelId);
}

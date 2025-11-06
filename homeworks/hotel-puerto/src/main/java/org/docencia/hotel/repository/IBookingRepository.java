package org.docencia.hotel.repository;

import java.util.List;

import org.docencia.hotel.model.Booking;
import org.docencia.hotel.repository.interfaces.ICrudRepository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IBookingRepository extends ICrudRepository<Booking> {
    List<Booking> findBookingsByRoomAndDateRange(String roomId, String fromInclusive, String toExclusive);
}

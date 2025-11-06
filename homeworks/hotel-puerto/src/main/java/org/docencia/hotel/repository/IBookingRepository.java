package org.docencia.hotel.repository;

import java.util.List;

import org.docencia.hotel.model.Booking;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IBookingRepository {
    boolean existsById(String id);
    Booking findById(String id);
    List<Booking> findAll();
    Booking save(Booking booking);
    boolean deleteById(String id);
    List<Booking> findBookingsByRoomAndDateRange(String roomId, String fromInclusive, String toExclusive);
}

package org.docencia.hotel.repository;

import java.util.List;

import org.docencia.hotel.model.Booking;
import org.docencia.hotel.repository.interfaces.IJpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface IBookingRepository extends IJpaRepository<Booking, String> {

    /**
     * Metodo para encontar bookings por la habitacion y un rango de fechas 
     * @param roomId indentificador de la habitacion
     * @param fromInclusive fechaInicial
     * @param toExclusive fechaFinal
     * @return una lista de bookings
     */
    List<Booking> findBookingsByRoomAndDateRange(String roomId, String fromInclusive, String toExclusive);
}

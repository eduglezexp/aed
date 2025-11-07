package org.docencia.hotel.persistence.jpa;

import java.util.List;

import org.docencia.hotel.model.Booking;
import org.docencia.hotel.persistence.jpa.abstracts.AbstractJpaRepository;
import org.docencia.hotel.repository.IBookingRepository;
import org.springframework.stereotype.Repository;


/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class BookingJpaRepository extends AbstractJpaRepository<Booking, String> {

    private final IBookingRepository repository;

    public BookingJpaRepository(IBookingRepository repository) {
        this.repository = repository;
    }

    /**
     * Metodo para encontar bookings por la habitacion y un rango de fechas 
     * @param roomId indentificador de la habitacion
     * @param fromInclusive fechaInicial
     * @param toExclusive fechaFinal
     * @return una lista de bookings
     */
    List<Booking> findBookingsByRoomAndDateRange(String roomId, String fromInclusive, String toExclusive) {
        return repository.findBookingsByRoomAndDateRange(roomId, fromInclusive, toExclusive);
    }
}

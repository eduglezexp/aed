package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Booking;
import org.docencia.hotel.repository.IBookingRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public class BookingJpaRepository extends AbstractJpaRepository<Booking, String> implements IBookingRepository {

    public BookingJpaRepository() { 
        super(Booking.class); 
    }

    @Override
    public List<Booking> findBookingsByRoomAndDateRange(String roomId, String fromInclusive, String toExclusive) {
        String jpql = "SELECT b FROM Booking b WHERE b.room.id = :roomId "
                    + "AND b.checkIn < :toExclusive AND b.checkOut > :fromInclusive "
                    + "ORDER BY b.checkIn";
        TypedQuery<Booking> querry = entityManager.createQuery(jpql, Booking.class);
        querry.setParameter("roomId", roomId);
        querry.setParameter("fromInclusive", fromInclusive);
        querry.setParameter("toExclusive", toExclusive);
        return querry.getResultList();
    }
}

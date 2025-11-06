package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Booking;
import org.docencia.hotel.repository.IBookingRepository;
import org.springframework.stereotype.Repository;

import jakarta.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookingJpaRepository extends AbstractJpaRepository<Booking, String> implements IBookingRepository {

    public BookingJpaRepository() { super(Booking.class); }

    @Override
    public boolean existsById(String id) { return super.existsById(id); }

    @Override
    public Booking findById(String id) { return super.findById(id); }

    @Override
    public List<Booking> findAll() { return super.findAll(); }

    @Override
    public Booking save(Booking booking) { return super.save(booking); }

    @Override
    public boolean deleteById(String id) { return super.deleteById(id); }

    @Override
    public List<Booking> findBookingsByRoomAndDateRange(String roomId, String fromInclusive, String toExclusive) {
        String jpql = "SELECT b FROM Booking b WHERE b.room.id = :roomId "
                    + "AND b.checkIn < :toExclusive AND b.checkOut > :fromInclusive "
                    + "ORDER BY b.checkIn";
        TypedQuery<Booking> q = entityManager.createQuery(jpql, Booking.class);
        q.setParameter("roomId", roomId);
        q.setParameter("fromInclusive", fromInclusive);
        q.setParameter("toExclusive", toExclusive);
        return q.getResultList();
    }
}

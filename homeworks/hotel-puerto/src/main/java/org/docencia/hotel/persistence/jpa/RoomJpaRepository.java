package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.repository.IRoomRepository;
import org.docencia.hotel.model.Room;
import org.springframework.stereotype.Repository;

import jakarta.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoomJpaRepository extends AbstractJpaRepository<Room, String> implements IRoomRepository {
    public RoomJpaRepository() {
        super(Room.class);
    }

    @Override
    public boolean existsById(String id) { return super.existsById(id); }

    @Override
    public Room findById(String id) { return super.findById(id); }

    @Override
    public List<Room> findAll() { return super.findAll(); }

    @Override
    public Room save(Room room) { return super.save(room); }

    @Override
    public boolean deleteById(String id) { return super.deleteById(id); }

    @Override
    public List<Room> findByHotelId(String hotelId) {
        String jpql = "SELECT r FROM Room r WHERE r.hotel.id = :hotelId";
        TypedQuery<Room> querry = entityManager.createQuery(jpql, Room.class);
        querry.setParameter("hotelId", hotelId);
        return querry.getResultList();
    }
}

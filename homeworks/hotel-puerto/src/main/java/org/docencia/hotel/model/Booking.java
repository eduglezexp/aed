package org.docencia.hotel.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "room_id")
    private String roomId;

    @Column(name = "guest_id")
    private String guestId;

    @Column(name = "check_in")
    private String checkIn;

    @Column(name = "check_out")
    private String checkOut;

    /**
     * Constructor por defecto
     */
    public Booking() {
    }

    /**
     * Constructor con la proiedad 
     * identificativa de la entidad
     * @param id de la booking
     */
    public Booking(String id) {
        this.id = id;
    }

    /**
     * Constructor con todas las propiedades
     * @param id de la booking
     * @param roomId de la booking
     * @param guestId de la booking
     * @param checkIn de la booking
     * @param checkOut de la booking
     */
    public Booking(String id, String roomId, String guestId, String checkIn, String checkOut) {
        this.id = id;
        this.roomId = roomId;
        this.guestId = guestId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    /**
     * Getters and Setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getGuestId() {
        return guestId;
    }

    public void setGuestId(String guestId) {
        this.guestId = guestId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Booking [id=" + id + ", roomId=" + roomId + ", guestId=" + guestId + ", checkIn=" + checkIn
                + ", checkOut=" + checkOut + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Booking)) {
            return false;
        }
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

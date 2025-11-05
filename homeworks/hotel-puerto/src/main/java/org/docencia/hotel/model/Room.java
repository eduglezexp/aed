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
@Table(name = "room")
public class Room {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "number")
    private String number;

    @Column(name = "type")
    private String type;

    @Column(name = "price_per_night")
    private float pricePerNight;

    @Column(name = "hotel_id")
    private String hotelId;

    /**
     * Constructor por defecto
     */
    public Room() {
    }

    /**
     * Constructor con la proiedad 
     * identificativa de la entidad
     * @param id de la room
     */
    public Room(String id) {
        this.id = id;
    }

    /**
     * Constructor con todas las propiedades
     * @param id de la room
     * @param number de la room
     * @param type de la room
     * @param pricePerNight de la room
     * @param hotelId de la room
     */
    public Room(String id, String number, String type, float pricePerNight, String hotelId) {
        this.id = id;
        this.number = number;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.hotelId = hotelId;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(float pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    @Override
    public String toString() {
        return "Room [id=" + id + ", number=" + number + ", type=" + type + ", pricePerNight=" + pricePerNight
                + ", hotelId=" + hotelId + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Room)) {
            return false;
        }
        Room room = (Room) o;
        return Objects.equals(id, room.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }    
}

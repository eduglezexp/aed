package org.docencia.hotel.repository;

import java.util.List;

import org.docencia.hotel.model.Hotel;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IHotelRepository {
    boolean existsById(String id);
    Hotel findById(String id);
    List<Hotel> findAll();
    Hotel save(Hotel hotel);
    boolean deleteById(String id);
}

package org.docencia.hotel.repository;

import org.docencia.hotel.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface IHotelRepository extends JpaRepository<Hotel, String> {

}

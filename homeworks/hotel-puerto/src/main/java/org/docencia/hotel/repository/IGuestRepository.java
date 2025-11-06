package org.docencia.hotel.repository;

import org.docencia.hotel.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface IGuestRepository extends JpaRepository<Guest, String> {

}

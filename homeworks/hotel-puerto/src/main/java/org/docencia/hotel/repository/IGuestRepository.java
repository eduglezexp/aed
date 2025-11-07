package org.docencia.hotel.repository;

import org.docencia.hotel.model.Guest;
import org.docencia.hotel.repository.interfaces.IJpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author eduglezexp
 * @version 1.0.0
 */

@Repository
public interface IGuestRepository extends IJpaRepository<Guest, String> {

}

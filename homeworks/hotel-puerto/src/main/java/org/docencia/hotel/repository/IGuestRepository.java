package org.docencia.hotel.repository;

import org.docencia.hotel.model.Guest;
import java.util.List;

/**
 * @author eduglezexp
 * @version 1.0.0
 */

public interface IGuestRepository {
    boolean existsById(String id);
    Guest findById(String id);
    List<Guest> findAll();
    Guest save(Guest guest);
    boolean deleteById(String id);
}

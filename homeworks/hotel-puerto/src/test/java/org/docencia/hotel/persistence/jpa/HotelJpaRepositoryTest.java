package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Hotel;
import org.docencia.hotel.repository.IHotelRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class HotelJpaRepositoryTest {

    @Autowired
    private IHotelRepository repository;
    private Hotel baseHotel;

    @BeforeEach
    @Transactional
    void beforeEach() {
        Hotel hotel = new Hotel();
        baseHotel = repository.save(hotel);
    }
}

package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Booking;
import org.docencia.hotel.repository.IBookingRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class BookingJpaRepositoryTest {

    @Autowired
    private IBookingRepository repository;
    private Booking bookingBase;

    @BeforeEach
    @Transactional
    void beforeEach() {
        Booking booking = new Booking();
        bookingBase = repository.save(booking);
    }
}

package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Guest;
import org.docencia.hotel.repository.IGuestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class GuestJpaRepositoryTest {
    
    @Autowired
    private IGuestRepository repository;
    private Guest baseGuest;

    @BeforeEach
    @Transactional
    void beforeEach() {
        Guest guest = new Guest();
        baseGuest = repository.save(guest);
    }
}

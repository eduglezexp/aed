package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Guest;
import org.docencia.hotel.repository.IGuestRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ActiveProfiles("test")
public class GuestJpaRepositoryTest {
    
    @Autowired
    private IGuestRepository repository;
    private Guest baseGuest;

    private String fullName = "fullname";
    private String email = "email";
    private String phone = "phone";

    @BeforeEach
    @Transactional

    void beforeEach() {
        Guest guest = new Guest(fullName, email, phone);
        baseGuest = repository.save(guest);
        assertThat(baseGuest.getId()).isNotNull();
    }

    @Test
    @Transactional
    void createReadFindByTitleTest() {
        
    }

    @Test
    @Transactional
    void updateContentTest() {
        
    }

    @Test
    @Transactional
    void findByIdTest() {
        
    }

    @Test
    @Transactional
    void deleteNoteTest() {
        
    }
}

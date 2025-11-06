package org.docencia.hotel.persistence.jpa;

import org.docencia.hotel.model.Room;
import org.docencia.hotel.repository.IRoomRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@ActiveProfiles("test")
public class RoomJpaRepositoryTest {

    @Autowired
    private IRoomRepository repository;
    private Room baseRoom;

    @BeforeEach
    @Transactional
    void beforeEach() {
        Room room = new Room();
        baseRoom = repository.save(room);
    }
}

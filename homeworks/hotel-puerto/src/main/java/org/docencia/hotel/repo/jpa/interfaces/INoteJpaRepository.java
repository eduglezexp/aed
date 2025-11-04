package org.docencia.hotel.repo.jpa.interfaces;

import org.docencia.hotel.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface INoteJpaRepository extends JpaRepository<Note, String> {
    Optional<Note> findFirstByTitle(String title);
}

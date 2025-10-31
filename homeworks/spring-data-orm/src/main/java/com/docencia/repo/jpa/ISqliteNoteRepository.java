package com.docencia.repo.jpa;

import com.docencia.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISqliteNoteRepository extends JpaRepository<Note, String> {

}

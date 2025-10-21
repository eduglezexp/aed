package com.docencia.files.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.docencia.files.model.Note;

public class JsonNoteServiceTest {
    JsonNoteService jsonNoteService;
    Note note;

    @BeforeEach
    void beforeEach() {
        jsonNoteService = new JsonNoteService();
        note = new Note("1", "Titulo", "Contenido");
    }

    @Test
    void serializarNote() {
        String noteStr = jsonNoteService.noteToString(note);
        Note noteTest = jsonNoteService.stringToNote(noteStr);
        Assertions.assertEquals(note, noteTest, 
        "Los elementos deben ser iguales");
    }
}

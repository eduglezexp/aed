package com.docencia.files.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.docencia.files.model.Note;

public class XmlNoteServiceTest {
    XmlNoteService xmlNoteService;
    Note note;

    @BeforeEach
    void beforeEach() {
        xmlNoteService = new XmlNoteService();
        note = new Note("1", "Titulo", "Contenido");
    }

    @Test
    void serializarNote() {
        String noteStr = xmlNoteService.noteToString(note);
        Note noteTest = xmlNoteService.stringToNote(noteStr);
        Assertions.assertEquals(note, noteTest, 
        "Los elementos deben ser iguales");
    }
}

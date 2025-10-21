package com.docencia.files.service.abstracts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.docencia.files.model.Note;
import com.docencia.files.repo.interfaces.INoteRepository;
import com.docencia.files.service.interfaces.INoteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractNoteService implements INoteService{

    @Autowired
    INoteRepository noteRepository;

    private ObjectMapper objectMapper;

    public INoteRepository getNoteRepository() {
        return noteRepository;
    }

    public void setNoteRepository(INoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public void setObjectMapper(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Override
    public boolean exists(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'exists'");
    }

    @Override
    public Note findById(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<Note> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public Note save(Note note) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public boolean delete(String id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public String noteToString(Note note) {
        String resultado = null;
        try {
            resultado = getObjectMapper().writeValueAsString(note);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Note stringToNote(String data) {
        Note resultado = null;
        try {
            resultado = getObjectMapper().readValue(data, Note.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}

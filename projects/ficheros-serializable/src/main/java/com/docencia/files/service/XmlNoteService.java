package com.docencia.files.service;

import java.util.List;

import com.docencia.files.model.Note;
import com.docencia.files.service.interfaces.INoteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlNoteService implements INoteService{
    XmlMapper xmlMapper;

    public XmlNoteService() {
        xmlMapper = new XmlMapper();
    }

    public XmlNoteService(XmlMapper xmlMapper) {
        this.xmlMapper = xmlMapper;
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
    public Note save(Note n) {
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
            resultado = xmlMapper.writeValueAsString(note);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public Note stringToNote(String data) {
        Note resultado = null;
        try {
            resultado = xmlMapper.readValue(data, Note.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return resultado;
    }
}

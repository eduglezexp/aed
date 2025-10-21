package com.docencia.files.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.docencia.files.model.Note;
import com.docencia.files.service.abstracts.AbstractNoteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlNoteService extends AbstractNoteService {

    XmlMapper xmlMapper;
    private static Logger logger = LoggerFactory.getLogger(XmlNoteService.class);

    public XmlNoteService() {
        xmlMapper = new XmlMapper();
        this.setObjectMapper(xmlMapper);
    }

    @Override
    public String noteToString(Note note) {
        String resultado = null;
        try {
            resultado = xmlMapper.writeValueAsString(note);
        } catch (JsonProcessingException e) {
            logger.error("Se ha producido un error en la transformacion de note {}", note, e);
        }
        return resultado;
    }

    @Override
    public Note stringToNote(String data) {
        Note resultado = null;
        try {
            resultado = xmlMapper.readValue(data, Note.class);
        } catch (JsonProcessingException e) {
            logger.error("Se ha producido un error en la transformacion de data {}", data, e);
        }
        return resultado;
    }
}

package com.docencia.files.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.docencia.files.model.Note;
import com.docencia.files.service.abstracts.AbstractNoteService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class JsonNoteService extends AbstractNoteService {

    JsonMapper jsonMapper;
    private static Logger logger = LoggerFactory.getLogger(JsonNoteService.class);

    public JsonNoteService()  {
        jsonMapper = new JsonMapper();
        this.setObjectMapper(jsonMapper);
    }

    @Override
    public String noteToString(Note note) {
        String resultado = null;
        try {
            resultado = jsonMapper.writeValueAsString(note);
        } catch (JsonProcessingException e) {
            logger.error("Se ha producido un error en la transformacion de note {}", note, e);
        }
        return resultado;
    }

    @Override
    public Note stringToNote(String data) {
        Note resultado = null;
        try {
            resultado = jsonMapper.readValue(data, Note.class);
        } catch (JsonProcessingException e) {
            logger.error("Se ha producido un error en la transformacion de data {}", data, e);
        }
        return resultado;
    }
}

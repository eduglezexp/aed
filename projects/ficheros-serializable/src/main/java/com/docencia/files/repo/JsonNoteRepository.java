package com.docencia.files.repo;

import com.docencia.files.repo.abstracts.AbstractNoteRepository;
import com.fasterxml.jackson.databind.json.JsonMapper;

public class JsonNoteRepository extends AbstractNoteRepository {
    
    private static String fileName = "note-repository.txt";
    private static JsonMapper jsonMapper = new JsonMapper();

    public JsonNoteRepository() {
        super(fileName, jsonMapper);
    }
    
}

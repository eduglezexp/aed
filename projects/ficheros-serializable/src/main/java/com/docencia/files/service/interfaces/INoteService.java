package com.docencia.files.service.interfaces;

import java.util.List;

import com.docencia.files.model.Note;

public interface INoteService {
    public boolean exists(String id);
    public Note findById(String id);
    public List<Note> findAll();
    public Note save(Note n);
    public boolean delete(String id);
    public String noteToString(Note note);
    public Note stringToNote(String data);
}

package com.docencia.repo.interfaces;

import java.util.List;

import com.docencia.model.Note;

public interface INoteRepository {
    public boolean exists(String id);
    public Note findById(String id);
    public Note find(Note note);
    public List<Note> findAll();
    public Note save(Note note);
    public boolean delete(String id);
}

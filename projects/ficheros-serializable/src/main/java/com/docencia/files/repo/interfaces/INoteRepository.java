package com.docencia.files.repo.interfaces;

import java.util.List;

import com.docencia.files.model.Note;

public interface INoteRepository {
    public boolean exists(String id);
    public Note findById(String id);
    public List<Note> findAll();
    public Note save(Note n);
    public boolean delete(String id);
}

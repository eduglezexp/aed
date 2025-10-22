package com.docencia.files.repo.abstracts;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.docencia.files.model.Note;
import com.docencia.files.repo.interfaces.INoteRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

public abstract class AbstractNoteRepository implements INoteRepository {
    private String fileName;
    private Path path;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    private ObjectMapper mapper;

    public AbstractNoteRepository(String fileName, ObjectMapper mapper) {
        this.fileName = fileName;
        path = verificarFichero();
        this.mapper = mapper;
    }

    /**
     * Metodo para verificar si existe un fichero y si no lo crea
     */
    public Path verificarFichero() {
        URL resource = getClass().getClassLoader().getResource(fileName);
        return Paths.get(resource.getPath());
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
        lock.readLock().lock();
        try {
            return Collections.unmodifiableList(readAllInternal());
        } finally {
            lock.readLock().unlock();
        }
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

    private List<Note> readAllInternal() {
        try {
            if (!Files.exists(path) || Files.size(path) == 0) return new ArrayList<>();
            Note[] arrayNotes = mapper.readValue(Files.readAllBytes(path), Note[].class);
            return new ArrayList<>(Arrays.asList(arrayNotes));
        } catch (IOException e) {
            throw new RuntimeException("Error leyendo JSON", e);
        }
    }
}

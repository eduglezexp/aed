package com.docencia.files.repo;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import com.docencia.files.model.Note;
import com.docencia.files.repo.interfaces.INoteRepository;

public class FileNoteRepository implements INoteRepository {
    private String fileName;

    public FileNoteRepository() {
        this.fileName = "note-repository.txt";
        try {
            verificarFichero();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo para verificar si existe un fichero y si no lo crea
     */
    private void verificarFichero() throws IOException{
        URL resource = getClass().getClassLoader().getResource(fileName);
        if (resource == null) {
            throw new IOException("El fichero no existe " + fileName);
        }
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
}

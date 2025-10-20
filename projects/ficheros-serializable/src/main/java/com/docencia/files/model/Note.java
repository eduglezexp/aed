package com.docencia.files.model;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

/**
 * Clase Note que almacena informacion
 * @author eduglezexp
 * @version 1.0.0
 */
public class Note {

    @NotBlank
    private String id;

    @NotBlank @Size(max = 200)
    private String title;

    @NotBlank
    private String content;

    /**
     * Constructor por defecto
     */
    public Note() {

    }
    
    /**
     * Constructor con todas las propiedades
     * @param id de la notas
     * @param title de la nota
     * @param content de la nota
     */
    public Note(@NotBlank String id, @NotBlank @Size(max = 200) String title, @NotBlank String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    /**
     * Getters and Setters
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Note)) {
            return false;
        }
        Note note = (Note) o;
        return Objects.equals(id, note.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

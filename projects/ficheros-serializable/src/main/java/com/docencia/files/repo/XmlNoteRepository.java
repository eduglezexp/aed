package com.docencia.files.repo;

import com.docencia.files.repo.abstracts.AbstractNoteRepository;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XmlNoteRepository extends AbstractNoteRepository{

    private static String fileName = "note-repository.txt";
    private static XmlMapper xmlMapper = new XmlMapper();

    public XmlNoteRepository() {
        super(fileName, xmlMapper);
    }
}

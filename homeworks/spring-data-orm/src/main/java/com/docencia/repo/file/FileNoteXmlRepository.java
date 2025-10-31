package com.docencia.repo.file;

import com.docencia.repo.file.abstracts.FileNoteAbstractRepository;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class FileNoteXmlRepository extends FileNoteAbstractRepository{
    
    private static String nameFile= "note-repository.xml";
    private static  XmlMapper mapper= new XmlMapper();

    public FileNoteXmlRepository() {
        super(nameFile, mapper);
    }
}

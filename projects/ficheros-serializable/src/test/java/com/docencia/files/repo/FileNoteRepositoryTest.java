package com.docencia.files.repo;

import org.junit.jupiter.api.Test;

class FileNoteRepositoryTest {
    XmlNoteRepository fileNoteRepository;

    @Test
    void createFileTest() {
        fileNoteRepository = new XmlNoteRepository();
    }
}

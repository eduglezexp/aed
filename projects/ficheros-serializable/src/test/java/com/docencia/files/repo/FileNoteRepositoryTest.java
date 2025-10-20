package com.docencia.files.repo;

import org.junit.jupiter.api.Test;

class FileNoteRepositoryTest {
    FileNoteRepository fileNoteRepository;

    @Test
    void createFileTest() {
        fileNoteRepository = new FileNoteRepository();
    }
}

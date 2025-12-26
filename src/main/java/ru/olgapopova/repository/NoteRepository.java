package ru.olgapopova.repository;

import java.io.IOException;
import java.util.List;

public interface NoteRepository {

    void saveNote(String note, String username) throws Exception;

    List<String> getNotesContent(String username) throws Exception;
}

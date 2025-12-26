package ru.olgapopova.front;

import ru.olgapopova.repository.NoteRepository;
import ru.olgapopova.session.UserSession;

import javax.swing.*;
import java.util.List;

public class NotesFront implements FtBase {

    private final NoteRepository noteRepository;

    public NotesFront(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public void start(UserSession userSession) throws Exception {
        List<String> notesContent = noteRepository.getNotesContent(userSession.getUser().getUsername());
        JOptionPane.showMessageDialog(null, notesContent.toString(),"Old Notes: ",  JOptionPane.INFORMATION_MESSAGE);
        String note = JOptionPane.showInputDialog("Your note:");
        noteRepository.saveNote(note, userSession.getUser().getUsername());
    }
}

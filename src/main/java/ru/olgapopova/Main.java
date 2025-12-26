package ru.olgapopova;

import ru.olgapopova.front.Front;
import ru.olgapopova.front.LoginFront;
import ru.olgapopova.front.NotesFront;
import ru.olgapopova.repository.FileNotesRepository;
import ru.olgapopova.repository.FileUserRepository;
import ru.olgapopova.session.UserSession;

import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        new Front(
                new LoginFront(
                        new FileUserRepository(
                                Path.of("users.csv")
                        )
                ),
                new NotesFront(
                        new FileNotesRepository(
                                Path.of("notes.csv")
                        )
                )
        ).start(UserSession.INSTANCE);
    }
}
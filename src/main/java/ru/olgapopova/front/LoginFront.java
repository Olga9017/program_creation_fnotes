package ru.olgapopova.front;

import ru.olgapopova.model.User;
import ru.olgapopova.repository.UserRepository;
import ru.olgapopova.session.UserSession;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.List;

import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class LoginFront implements FtBase {

    private final UserRepository userRepository;

    public LoginFront(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void start(UserSession userSession) throws Exception {

        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");

        User user = null;
        try {
            user = userRepository.findAll()
                    .stream()
                    .filter(u -> u.isSaneUser(username, password))
                    .findFirst()
                    .orElseThrow();
        } catch (NoSuchFieldException e) {
            JOptionPane.showMessageDialog(null, "User not found :(", "Error", ERROR_MESSAGE);
            start(userSession);
        }
        userSession.setUser(user);

    }
}

package ru.olgapopova.front;

import ru.olgapopova.model.User;
import ru.olgapopova.session.UserSession;

public interface FtBase {
    void start(UserSession session) throws Exception;

}

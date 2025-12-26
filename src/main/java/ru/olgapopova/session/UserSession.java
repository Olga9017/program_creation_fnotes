package ru.olgapopova.session;

import ru.olgapopova.model.User;

public enum UserSession {
   INSTANCE;

   private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

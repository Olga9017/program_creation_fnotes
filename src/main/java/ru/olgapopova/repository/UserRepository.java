package ru.olgapopova.repository;

import ru.olgapopova.model.User;

import java.util.List;

public interface UserRepository {

    List<User> findAll () throws Exception;
}

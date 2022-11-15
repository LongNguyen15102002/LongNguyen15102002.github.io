package com.example.btvnbuoi2spring.database;

import com.example.btvnbuoi2spring.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<User> users = new ArrayList<>(List.of(
            new User(1, "username1", "username1@gmail.com", "@username1", "avatar1"),
            new User(2, "username2", "username2@gmail.com", "@username2", "avatar2"),
            new User(3, "username3", "username3@gmail.com", "@username3", "avatar3")
    ));
}

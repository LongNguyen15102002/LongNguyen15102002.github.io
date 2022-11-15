package com.example.btvnbuoi2spring.repository;

import com.example.btvnbuoi2spring.database.FakeDB;
import com.example.btvnbuoi2spring.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {
    public List<User> findAll() {
        return FakeDB.users;
    }

    public void save(User user){
        FakeDB.users.add(user);
    }

    public void delete(User user){
        FakeDB.users.remove(user);
    }
}

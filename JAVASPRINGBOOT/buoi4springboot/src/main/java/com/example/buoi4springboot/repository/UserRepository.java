package com.example.buoi4springboot.repository;

import com.example.buoi4springboot.database.FakeDB;
import com.example.buoi4springboot.model.User;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private List<User> users;
    private final Faker faker;
    private UserRepository (Faker faker){
        this.faker = faker;
        initUsers();
    }

    public List<User> findAll(){
        return FakeDB.users;
    }
    private void initUsers(){
        users = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            User user = new User(
                    i,
                    faker.name().fullName(),
                    faker.internet().emailAddress(),
                    faker.phoneNumber().phoneNumber(),
                    faker.address().cityName(),
                    faker.avatar().image(),
                    faker.internet().password()
            );
            users.add(user);
        }
    }
    public Optional<User> findById(Integer userId) {
        Optional<User> user = users.stream().filter(c -> c.getId() == userId).findFirst();
        return user;
    }

    public Optional<User> findByName(String name){
        Optional<User> user = users.stream().filter(c -> c.getName() == name).findFirst();
        return user;
    }

    public void save(User user){
        FakeDB.users.add(user);
    }

    public void delete(User user){
        FakeDB.users.remove(user);
    }
}

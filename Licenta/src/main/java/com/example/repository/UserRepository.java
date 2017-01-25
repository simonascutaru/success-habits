package com.example.repository;


import com.example.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sscutaru on 1/25/2017.
 */
@Repository
@RequestMapping("/user")
public class UserRepository {

    private static Map<Integer, User> users;

    static {

        users = new HashMap<Integer, User>(){

            {
                put(1, new User(1, "Said", "mail@mail.com", "password"));
                put(2, new User(2, "Alex", "mail@mail.com", "password"));
                put(3, new User(3, "Anna", "mail@mail.com", "password"));
            }
        };
    }

    public Collection<User> getAllUsers(){
        return this.users.values();
    }

    public User getUserById(int id){
        return this.users.get(id);
    }

    public void removeUserById(int id) {
        this.users.remove(id);
    }

    public void updateUser(User user){
        User u = users.get(user.getId());
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setPassword(user.getPassword());
        users.put(user.getId(), user);
    }

    public void insertUserToDb(User user) {
        this.users.put(user.getId(), user);
    }
}

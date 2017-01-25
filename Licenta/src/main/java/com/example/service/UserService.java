package com.example.service;

import com.example.repository.UserRepository;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by sscutaru on 1/25/2017.
 */
@Service
public class UserService {

    @Autowired
//    @Qualifier("mongoData")
    private UserRepository userRepository;

    public Collection<User> getAllUsers(){
        return this.userRepository.getAllUsers();
    }

    public User getUserById(int id){
        return this.userRepository.getUserById(id);
    }


    public void removeUserById(int id) {
        this.userRepository.removeUserById(id);
    }

    public void updateUser(User user){
        this.userRepository.updateUser(user);
    }

    public void insertUser(User user) {
        this.userRepository.insertUserToDb(user);
    }

}

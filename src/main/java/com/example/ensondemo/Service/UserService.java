package com.example.ensondemo.Service;



import com.example.ensondemo.Entity.User;
import com.example.ensondemo.Reporistory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class UserService {

    @Autowired
    UserRepository userRepository;


    public List<User> findAll(){
        return  userRepository.findAll();
    }

    public Optional<User> findById(Integer id){
        return userRepository.findById(id);
    }

    public  User save(User user){

        return   userRepository.save(user);
    }
    public  void  deleteById(Integer id){
        userRepository.deleteById(id);
    }
}


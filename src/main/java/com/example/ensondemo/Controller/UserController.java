package com.example.ensondemo.Controller;


import com.example.ensondemo.Entity.User;
import com.example.ensondemo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {


    @Autowired
    UserService userService;




    @GetMapping("/")
    public  ResponseEntity<List<User>> getAll(){
        return  ResponseEntity.ok(userService.findAll());

    }

    @GetMapping("/{id}")
    public  ResponseEntity<User> findById(@PathVariable Integer id){

        Optional<User> user = userService.findById(id);

        return ResponseEntity.ok(user.get());

    }
    @PostMapping("/")
    public ResponseEntity create(@RequestBody User user) {
        return ResponseEntity.ok(userService.save(user));


    }

    @PutMapping("/{id}")
    public  ResponseEntity<User> update(@PathVariable Integer id , @Valid @RequestBody User user){


        userService.deleteById(id);
        return ResponseEntity.ok().build();


        }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {

        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    }







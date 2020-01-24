package com.example.ensondemo.Reporistory;

import com.example.ensondemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User , Integer> {



}

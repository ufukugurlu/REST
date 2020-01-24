package com.example.ensondemo.Entity;

import javax.persistence.*;


@Entity
@Table(name = "ufukkk")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        Integer id;
        @Column(name = "first_name" )
        String firstName;
        @Column(name = "last_name" )
        String lastName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

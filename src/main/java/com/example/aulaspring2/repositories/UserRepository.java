package com.example.aulaspring2.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.aulaspring2.entities.User;

public interface UserRepository extends MongoRepository<User, String> {
}

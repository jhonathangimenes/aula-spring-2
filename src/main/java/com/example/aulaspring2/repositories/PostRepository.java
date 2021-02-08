package com.example.aulaspring2.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.aulaspring2.entities.Post;

public interface PostRepository extends MongoRepository<Post, String> {
}

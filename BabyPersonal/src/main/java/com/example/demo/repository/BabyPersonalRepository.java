package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.BabyPersonalPojo;

public interface BabyPersonalRepository extends MongoRepository<BabyPersonalPojo, String>{

}

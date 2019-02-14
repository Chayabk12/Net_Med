package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.BabyFoodPojo;

public interface BabyFoodRepository extends MongoRepository<BabyFoodPojo, String>{

}

package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.BabyNapkinsPojo;

public interface BabyNapkinsRepository extends MongoRepository<BabyNapkinsPojo, String>{

}

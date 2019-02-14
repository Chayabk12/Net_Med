package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.BabyPersonalPojo;
import com.example.demo.repository.BabyPersonalRepository;

@Service
public class BabyPersonalService {
	
	@Autowired
	BabyPersonalRepository babyprepo;
	
	//creating data in database
	public void addbabypersonal(BabyPersonalPojo babyppojo) {
		
		babyprepo.save(babyppojo);
		
	}
	
	
	//getting all the products added in database
	public List<BabyPersonalPojo> getpersonal() {
		List<BabyPersonalPojo> babyppro = new ArrayList<>();
		babyprepo.findAll().forEach(babyppro::add);
		return babyppro;
	}
	
	
	//getting data by Id
	public Optional<BabyPersonalPojo> getpersonalById(String id) {
		return babyprepo.findById(id);
	}

	
	//deleting by id
	public String deletePersonalById(String id) {
		List<BabyPersonalPojo> babypersonal = babyprepo.findAll();

		for (BabyPersonalPojo body : babypersonal) {
			
			if (body.getPersonalname().equals(id)) {
				babyprepo.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}
}

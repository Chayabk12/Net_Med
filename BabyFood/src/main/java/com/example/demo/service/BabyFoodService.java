package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BabyFoodPojo;
import com.example.demo.repository.BabyFoodRepository;

@Service
public class BabyFoodService {

	@Autowired
	BabyFoodRepository babyfrepo;

	//creating data in database
	public void addbabyfood(BabyFoodPojo babyfpojo) {

		babyfrepo.save(babyfpojo);

	}

	
	//getting all the products added in database
	public List<BabyFoodPojo> getAllProducts() {

		List<BabyFoodPojo> babyfpro = new ArrayList<>();
		babyfrepo.findAll().forEach(babyfpro::add);
		return babyfpro;

	}

	
	//getting data by Id
	public Optional<BabyFoodPojo> getById(String id) {

		return babyfrepo.findById(id);

	}
	
	
	//deleting by id
	public String deleteFoodById(String id) {
		List<BabyFoodPojo> babyfood = babyfrepo.findAll();

		for (BabyFoodPojo body : babyfood) {
			
			if (body.getBpname().equals(id)) {
				babyfrepo.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}

}

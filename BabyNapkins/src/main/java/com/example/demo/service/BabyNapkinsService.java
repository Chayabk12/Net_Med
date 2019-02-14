package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.model.BabyNapkinsPojo;
import com.example.demo.repository.BabyNapkinsRepository;

@Service
public class BabyNapkinsService {

	@Autowired
	BabyNapkinsRepository babynrepo;

	
	//creating data in database
	public void addbabynapkin(BabyNapkinsPojo babynpojo) {

		babynrepo.save(babynpojo);

	}

	
	//getting all the products added in database
	public List<BabyNapkinsPojo> getnapkin() {
		List<BabyNapkinsPojo> babynpro = new ArrayList<>();
		babynrepo.findAll().forEach(babynpro::add);
		return babynpro;
	}

	
	//getting data by Id
	public Optional<BabyNapkinsPojo> getNapkinById(String id) {
		return babynrepo.findById(id);
	}

	
	//deleting by id
	public String deleteNapkinById(String id) {
		List<BabyNapkinsPojo> babynapkin = babynrepo.findAll();

		for (BabyNapkinsPojo body : babynapkin) {
			
			if (body.getNapkinname().equals(id)) {
				babynrepo.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}
}

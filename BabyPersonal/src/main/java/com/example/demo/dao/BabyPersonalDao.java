package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BabyPersonalPojo;

import com.example.demo.service.BabyPersonalService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="BabyPersonal Details")
public class BabyPersonalDao {
	
	@Autowired
	private BabyPersonalService babypservice;
	
	@ApiOperation(value = "Add BabyPersonal Details in Database")
	@RequestMapping(value = "/babypersonaladd", method = RequestMethod.POST) 
	public void add(@RequestBody BabyPersonalPojo babyppojo) {
		babypservice.addbabypersonal(babyppojo);
	}
	
	@ApiOperation(value = "Add BabyPersonal Details in Database")
	@RequestMapping(value = "/babypersonalget", method = RequestMethod.GET)
	public List<BabyPersonalPojo> getProduct() {
		return babypservice.getpersonal();
	}
	
	@ApiOperation(value = "Add BabyPersonal Details in Database")
	@RequestMapping(value = "/babypersonalgetbyid/{id}", method = RequestMethod.GET)
	public Optional<BabyPersonalPojo> getById(@PathVariable String id) {
		return babypservice.getpersonalById(id);
	}
	
	@ApiOperation(value = "Delete BabyPersonal Details By Id")
	@RequestMapping(method = RequestMethod.DELETE, value = "/babypersonaldeletebyid/{id}")
	public String deletePersonalById(@PathVariable String id) {
		return babypservice.deletePersonalById(id);

	}

}

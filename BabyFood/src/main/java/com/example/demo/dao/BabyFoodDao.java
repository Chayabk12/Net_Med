package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BabyFoodPojo;
import com.example.demo.service.BabyFoodService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="BabyFood Details")
public class BabyFoodDao {

	@Autowired
	private BabyFoodService babyfservice;

	
	@ApiOperation(value = "Add BabyFood Details in Database")
	@RequestMapping(method = RequestMethod.POST, value = "/babyfoodadd")
	public void add(@RequestBody BabyFoodPojo babyfpojo) {
		babyfservice.addbabyfood(babyfpojo);
	}

	@ApiOperation(value = "Return All BabyFood Details")
	@RequestMapping(method = RequestMethod.GET, value = "/babyfoodget")
	public List<BabyFoodPojo> getProduct() {
		return babyfservice.getAllProducts();
	}

	@ApiOperation(value = "Return BabyFood Details By Id")
	@RequestMapping(method = RequestMethod.GET, value = "/babyfoodgetbyid/{id}")
	public Optional<BabyFoodPojo> getById(@PathVariable String id) {
		return babyfservice.getById(id);

	}
	
	@ApiOperation(value = "Delete BabyNapkins Details By Id")
	@RequestMapping(method = RequestMethod.DELETE, value = "/babynapkinsdeletebyid/{id}")
	public String deleteNapkinsById(@PathVariable String id) {
		return babyfservice.deleteFoodById(id);

	}

}

package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.BabyNapkinsPojo;
import com.example.demo.service.BabyNapkinsService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value="BabyNapkins Details")
public class BabyNapkinsDao {

	@Autowired
	private BabyNapkinsService babynservice;

	@ApiOperation(value = "Add BabyNapkins Details in Database")
	@RequestMapping(method = RequestMethod.POST, value = "/babynapkinsadd")
	public void addbabyNapkins(@RequestBody BabyNapkinsPojo babynpojo) {
		babynservice.addbabynapkin(babynpojo);
	}

	@ApiOperation(value = "Return All BabyNapkins Details")
	@RequestMapping(method = RequestMethod.GET, value = "/babynapkinsget")
	public List<BabyNapkinsPojo> getnapkins() {
		return babynservice.getnapkin();
	}
	
	@ApiOperation(value = "Return BabyNapkins Details By Id")
	@RequestMapping(method = RequestMethod.GET, value = "/babynapkinsgetbyid/{id}")
	public Optional<BabyNapkinsPojo> getNapkinsById(@PathVariable String id) {
		return babynservice.getNapkinById(id);
	}
	
	@ApiOperation(value = "Delete BabyNapkins Details By Id")
	@RequestMapping(method = RequestMethod.DELETE, value = "/babynapkinsdeletebyid/{id}")
	public String deleteNapkinsById(@PathVariable String id) {
		return babynservice.deleteNapkinById(id);

	}

}

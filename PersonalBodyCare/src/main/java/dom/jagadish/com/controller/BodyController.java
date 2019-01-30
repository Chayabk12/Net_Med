package dom.jagadish.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dom.jagadish.com.model.BodyLotion;
import dom.jagadish.com.service.BodyService;

@EnableDiscoveryClient

@RestController

public class BodyController {

	@Autowired
	private BodyService bodyService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/bodyproduct")
	public BodyLotion addBodyProduct(@RequestBody BodyLotion personalCare) {

		return bodyService.saveBodyProduct(personalCare);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/bodyproducts")
	public List<BodyLotion> getallBodyProducts() {
		return bodyService.getBodyProductDetails();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/bodyproduct/{id}")
	public Optional<BodyLotion> getBodyProduct(@PathVariable String id) {
		return bodyService.getBodyProductDetail(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/bodyupdate/{id}")
	public boolean updateBodyProduct(@RequestBody BodyLotion bodyLotion, @PathVariable String id) {
		return bodyService.updateBodyProduct(bodyLotion, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/bodydelete/{id}")
	public String deleteBodyProduct(@PathVariable String id) {
		return bodyService.deleteBodyProduct(id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/bodyproduct/deleteAll")
	public String deleteAllBodyProducts() {
		return bodyService.deleteAllBodyProducts();
	}

}

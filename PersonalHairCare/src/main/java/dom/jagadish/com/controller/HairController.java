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

import dom.jagadish.com.model.HairCare;
import dom.jagadish.com.service.HairService;

@EnableDiscoveryClient
@RestController
public class HairController {

	@Autowired
	private HairService hairService;

	@RequestMapping(method = RequestMethod.POST, value = "/hairproduct")
	public HairCare addHairProduct(@RequestBody HairCare care) {
		return hairService.saveHairProduct(care);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hairproducts")
	public List<HairCare> getallHairProducts() {
		return hairService.getFaceProductDetails();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/hairproduct/{id}")
	public Optional<HairCare> getFaceProduct(@PathVariable String id) {
		return hairService.getHairProduct(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/hairupdate/{id}")
	public boolean updateHairProduct(@RequestBody HairCare bodyLotion, @PathVariable String id) {
		return hairService.updateHairProduct(bodyLotion, id);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/hairdelete/{id}")
	public String deleteHairProduct(@PathVariable String id) {
		return hairService.deleteHairProduct(id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/hairproduct/deleteAll")
	public String deleteAllHairProducts() {
		return hairService.deleteAllHairProducts();
	}

}

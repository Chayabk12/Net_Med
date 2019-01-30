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

import dom.jagadish.com.model.FaceCreams;
import dom.jagadish.com.service.FaceService;

@EnableDiscoveryClient
@RestController
public class FaceController {

	@Autowired
	private FaceService faceService;

	@RequestMapping(method = RequestMethod.POST, value = "/faceproduct")
	public FaceCreams addFaceProduct(@RequestBody FaceCreams personalCare) {

		return faceService.saveFaceProduct(personalCare);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/faceproducts")
	public List<FaceCreams> getallFaceProducts() {
		return faceService.getFaceProductDetails();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/faceproduct/{id}")
	public Optional<FaceCreams> getFaceProduct(@PathVariable String id) {
		return faceService.getFaceCreamProduct(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/faceupdate/{id}")
	public boolean updateFaceProduct(@RequestBody FaceCreams face, @PathVariable String id) {
		return faceService.updateFaceProduct(face, id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/facedelete/{id}")
	public String deleteFaceProduct(@PathVariable String id) {
		return faceService.deleteFaceProduct(id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/faceproduct/deleteAll")
	public String deleteAllFaceProducts() {
		return faceService.deleteAllFaceProducts();
	}
}

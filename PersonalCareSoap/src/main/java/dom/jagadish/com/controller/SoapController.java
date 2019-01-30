
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

import dom.jagadish.com.model.Soap;
import dom.jagadish.com.service.SoapService;

@EnableDiscoveryClient
@RestController
public class SoapController {
	

	@Autowired
	private SoapService soapService;

	@RequestMapping(method = RequestMethod.POST, value = "/soapproduct")
	public Soap addSoapProduct(@RequestBody Soap saopcare) {

		return soapService.saveSoapProduct(saopcare);

	}

	@RequestMapping(method = RequestMethod.GET, value = "/soapproducts")
	public List<Soap> getallSoapProducts() {
		return soapService.getSoapProductDetails();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/soapproduct/{id}")
	public Optional<Soap> getSoapProduct(@PathVariable String id) {
		return soapService.getSoapProduct(id);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/soapupdate/{id}")
	public boolean updateSoapProduct(@RequestBody Soap bodyLotion, @PathVariable String id) {
		return soapService.updateSoapProduct(bodyLotion, id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/soapdelete/{id}")
	public String deleteSoapProduct(@PathVariable String id) {
		return soapService.deleteSoapProduct(id);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/soapproduct/deleteAll")
	public String deleteAllSoapProducts() {
		return soapService.deleteAllSoapProducts();
	}

	/*
	 * @RequestMapping(method = RequestMethod.POST, value = "/add")
	 * 
	 * @GetMapping("/soappro") public String addImages() throws
	 * FileNotFoundException {
	 * 
	 * File fileFolder = new File("C:/Users/hjagadis/Desktop/images");
	 * 
	 * if(fileFolder!=null) { for(final File file : fileFolder.listFiles()) {
	 * if(!file.isDirectory()) {
	 * 
	 * try {
	 * 
	 * String fileName = file.getName(); String fileId = ""; DBObject metadata = new
	 * BasicDBObject(); metadata.put("organization", "Jagadish"); InputStream
	 * inputStream = new FileInputStream(file); metadata.put("type","image");
	 * metadata.put("_id", fileName); gridFsOperations.store(inputStream,fileName,
	 * "image/png", metadata); fileId= ObjectId.get().toString();
	 * 
	 * System.out.println("FieldId = " + fileId); } catch(Exception e) {
	 * 
	 * }
	 * 
	 * }}}
	 * 
	 * return "Done"; }
	 */
}

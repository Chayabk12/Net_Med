package dom.jagadish.com.restTemplate;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

import dom.jagadish.com.model.BodyLotion;
import dom.jagadish.com.model.FaceCreams;
import dom.jagadish.com.model.HairCare;
import dom.jagadish.com.model.Soap;

@RestController
public class RestServices {

	@Autowired
	private EurekaClient client;

	@Autowired
	private RestTemplateBuilder restTemplateBuilder;

	/*********************************************......BODY......*****************************************************/
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/bodyproduct")
	public String addBodyProduct(@RequestBody BodyLotion bodyLotion) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BodyLotion> entity = new HttpEntity<BodyLotion>(bodyLotion, headers);
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseHairProductUrl();
		return restTemplate.exchange(baseUrl + "/bodyproduct", HttpMethod.POST, entity, String.class).getBody();

	}

	@RequestMapping(method = RequestMethod.GET, value ="/bodyproducts")
	public List<BodyLotion> getAllBodyProducts() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseBodyProductUrl();
		ResponseEntity<List<BodyLotion>> response = restTemplate.exchange(baseUrl + "/bodyproducts", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<BodyLotion>>() {
				});
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/bodyproduct/{id}")
	public BodyLotion getByBodyProduct(@PathVariable String id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseBodyProductUrl();
		ResponseEntity<BodyLotion> response = restTemplate.exchange(baseUrl + "/bodyproduct/" + id, HttpMethod.GET, null,
				BodyLotion.class);
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "bodydelete/{Id}")
	public String deleteBodyProductById(@PathVariable String Id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseBodyProductUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/bodydelete/" + Id, HttpMethod.DELETE, null,
				String.class);
		return response.getBody();
	}

	/*********************************************......SOAP......*****************************************************/
	 
	@RequestMapping(method = RequestMethod.POST, value = "/soapproduct")
	public String addSoapProduct(@RequestBody Soap hairCare) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<Soap> entity = new HttpEntity<Soap>(hairCare, headers);
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseSoapProductUrl();
		return restTemplate.exchange(baseUrl + "/soapproduct", HttpMethod.POST, entity, String.class).getBody();

	}

	@RequestMapping(method = RequestMethod.GET, value ="/soapproducts")
	public List<Soap> getAllSoapProducts() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		
		String baseUrl = GetBaseSoapProductUrl();

		ResponseEntity<List<Soap>> response = restTemplate.exchange(baseUrl + "/soapproducts", HttpMethod.GET, null,
				new ParameterizedTypeReference<List<Soap>>() {
				});
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/soapproduct/{id}")
	public Soap getBySoapProduct(@PathVariable String id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseSoapProductUrl();
		ResponseEntity<Soap> response = restTemplate.exchange(baseUrl + "/soapproduct/" + id, HttpMethod.GET, null,
				Soap.class);
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/soapdelete/{Id}")
	public String deleteSoapProductById(@PathVariable String Id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseSoapProductUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/soapdelete/" + Id, HttpMethod.DELETE, null,
				String.class);
		return response.getBody();
	}

	/*********************************************......FACE......*****************************************************/
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/faceproduct")
	public String addFaceProduct(@RequestBody FaceCreams hairCare) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<FaceCreams> entity = new HttpEntity<FaceCreams>(hairCare, headers);
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseFaceProductUrl();
		return restTemplate.exchange(baseUrl + "/faceproduct", HttpMethod.POST, entity, String.class).getBody();

	}

	@RequestMapping(method = RequestMethod.GET, value ="/faceproducts")
	public List<FaceCreams> getAllFaceProducts() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		
		String baseUrl = GetBaseFaceProductUrl();

		ResponseEntity<List<FaceCreams>> response = restTemplate.exchange(baseUrl + "/faceproducts", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<FaceCreams>>() {
				});
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/faceproduct/{id}")
	public FaceCreams getByFaceProduct(@PathVariable String id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseFaceProductUrl();

		ResponseEntity<FaceCreams> response = restTemplate.exchange(baseUrl + "/faceproduct/" + id, HttpMethod.GET,
				null, FaceCreams.class);
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/facedelete/{Id}")
	public String deleteFaceById(@PathVariable String Id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseFaceProductUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/facedelete/" + Id, HttpMethod.DELETE, null,
				String.class);
		return response.getBody();
	}

	
	/*********************************************......HAIR......*****************************************************/
	
	@RequestMapping(method = RequestMethod.POST, value = "/hairproduct")
	public String addHairProduct(@RequestBody HairCare hairCare) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<HairCare> entity = new HttpEntity<HairCare>(hairCare, headers);
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseHairProductUrl();
		return restTemplate.exchange(baseUrl + "/hairproduct", HttpMethod.POST, entity, String.class).getBody();

	}

	@RequestMapping(method = RequestMethod.GET, value ="/hairproducts")
	public List<HairCare> getAllHairProducts() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseHairProductUrl();
		ResponseEntity<List<HairCare>> response = restTemplate.exchange(baseUrl + "/hairproducts", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<HairCare>>() {
				});
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.GET, value ="/hairproduct/{id}")
	public HairCare getByHairProduct(@PathVariable String id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseHairProductUrl();
		ResponseEntity<HairCare> response = restTemplate.exchange(baseUrl + "/hairproduct/" + id, HttpMethod.GET, null,
				HairCare.class);
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/productdelete/{Id}")
	public String deleteHairProductById(@PathVariable String Id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = GetBaseHairProductUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/productdelete/" + Id, HttpMethod.DELETE, null,
				String.class);
		return response.getBody();
	}

	/**************************************************************************************************/
	private String GetBaseHairProductUrl() {

		InstanceInfo instanceInfo = client.getNextServerFromEureka("hairproducts-service", false);
		String baseUrl = instanceInfo.getHomePageUrl();

		return baseUrl;
	}

	private String GetBaseFaceProductUrl() {

		InstanceInfo instanceInfo = client.getNextServerFromEureka("facecare-service", false);
		String baseUrl = instanceInfo.getHomePageUrl();

		return baseUrl;
	}

	private String GetBaseBodyProductUrl() {

		InstanceInfo instanceInfo = client.getNextServerFromEureka("bodycare-service", false);
		String baseUrl = instanceInfo.getHomePageUrl();

		return baseUrl;
	}

	private String GetBaseSoapProductUrl() {

		InstanceInfo instanceInfo = client.getNextServerFromEureka("soap-service", false);
		String baseUrl = instanceInfo.getHomePageUrl();

		return baseUrl;
	}
}
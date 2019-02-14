package com.example.demo.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
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
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.BabyFoodPojo;
import com.example.demo.model.BabyNapkinsPojo;
import com.example.demo.model.BabyPersonalPojo;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@EnableDiscoveryClient
public class BabyProductsDao {

	@Autowired
	RestTemplateBuilder restTemplateBuilder;

	@Autowired
	EurekaClient client;

	//Rest Template services for baby food products
	@RequestMapping(method = RequestMethod.GET, value = "/babyfoodget")
	public List<BabyFoodPojo> getAllBabyFood() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyFoodBaseUrl();
		ResponseEntity<List<BabyFoodPojo>> response = restTemplate.exchange(baseUrl + "/babyfoodget",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<BabyFoodPojo>>() {
				});
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/babyfoodgetbyid/{id}")
	public BabyFoodPojo getFoodById(@PathVariable String id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyFoodBaseUrl();
		ResponseEntity<BabyFoodPojo> response = restTemplate.exchange(baseUrl + "/babyfoodgetbyid/" + id, HttpMethod.GET,
				null, BabyFoodPojo.class);
		return response.getBody();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/babyfoodadd")
	public String addBabyFood(@RequestBody BabyFoodPojo babynpojo) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BabyFoodPojo> entity = new HttpEntity<BabyFoodPojo>(babynpojo, headers);
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyFoodBaseUrl();
		return restTemplate.exchange(baseUrl + "/babyfoodadd", HttpMethod.POST, entity, String.class).getBody();

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/babyfooddeletebyid/{id}")
	public String deleteBabyFoodById(@PathVariable String Id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyFoodBaseUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/babyfooddeletebyid/" + Id, HttpMethod.DELETE, null,
				String.class);
		return response.getBody();
	}

	private String getBabyFoodBaseUrl() {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("food-service", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		return baseUrl;
	}

	
	//Rest Template services for baby napkins products
	@RequestMapping(method = RequestMethod.GET, value = "/babynapkinsget")
	public List<BabyNapkinsPojo> getAllBabyNapkins() {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyNapkinsBaseUrl();
		ResponseEntity<List<BabyNapkinsPojo>> response = restTemplate.exchange(baseUrl + "/babynapkinsget",
				HttpMethod.GET, null, new ParameterizedTypeReference<List<BabyNapkinsPojo>>() {
				});
		return response.getBody();
	}

	@RequestMapping(method = RequestMethod.GET, value = "/babynapkinsgetbyid/{id}")
	public BabyNapkinsPojo getNapkinById(@PathVariable String id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyNapkinsBaseUrl();
		ResponseEntity<BabyNapkinsPojo> response = restTemplate.exchange(baseUrl + "/babynapkinsgetbyid/" + id, HttpMethod.GET,
				null, BabyNapkinsPojo.class);
		return response.getBody();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/babynapkinsadd")
	public String addBodyProduct(@RequestBody BabyNapkinsPojo babynpojo) {
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<BabyNapkinsPojo> entity = new HttpEntity<BabyNapkinsPojo>(babynpojo, headers);
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyNapkinsBaseUrl();
		return restTemplate.exchange(baseUrl + "/babynapkinsadd", HttpMethod.POST, entity, String.class).getBody();

	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/babynapkinsdeletebyid/{id}")
	public String deleteBabyNapkinsById(@PathVariable String Id) {
		RestTemplate restTemplate = restTemplateBuilder.build();
		String baseUrl = getBabyNapkinsBaseUrl();
		ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/babynapkinsdeletebyid/" + Id, HttpMethod.DELETE, null,
				String.class);
		return response.getBody();
	}

	private String getBabyNapkinsBaseUrl() {
		InstanceInfo instanceInfo = client.getNextServerFromEureka("napkin-service", false);
		String baseUrl = instanceInfo.getHomePageUrl();
		return baseUrl;
	}
	
	
	//Rest Template services for baby personal products
		@RequestMapping(method = RequestMethod.GET, value = "/babypersonalget")
		public List<BabyPersonalPojo> getAllBabyPersonal() {
			RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getBabyPersonalBaseUrl();
			ResponseEntity<List<BabyPersonalPojo>> response = restTemplate.exchange(baseUrl + "/babypersonalget",
					HttpMethod.GET, null, new ParameterizedTypeReference<List<BabyPersonalPojo>>() {
					});
			return response.getBody();
		}

		@RequestMapping(method = RequestMethod.GET, value = "/babypersonalgetbyid/{id}")
		public BabyPersonalPojo getPersonalById(@PathVariable String id) {
			RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getBabyPersonalBaseUrl();
			ResponseEntity<BabyPersonalPojo> response = restTemplate.exchange(baseUrl + "/babypersonalgetbyid/" + id, HttpMethod.GET,
					null, BabyPersonalPojo.class);
			return response.getBody();
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "/babypersonaladd")
		public String addpersonalProduct(@RequestBody BabyPersonalPojo babyppojo) {
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			HttpEntity<BabyPersonalPojo> entity = new HttpEntity<BabyPersonalPojo>(babyppojo, headers);
			RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getBabyPersonalBaseUrl();
			return restTemplate.exchange(baseUrl + "/babypersonaladd", HttpMethod.POST, entity, String.class).getBody();

		}
		
		@RequestMapping(method = RequestMethod.DELETE, value = "/babypersonaldeletebyid/{id}")
		public String deleteBabyPersonalById(@PathVariable String Id) {
			RestTemplate restTemplate = restTemplateBuilder.build();
			String baseUrl = getBabyPersonalBaseUrl();
			ResponseEntity<String> response = restTemplate.exchange(baseUrl + "/babypersonaldeletebyid/" + Id, HttpMethod.DELETE, null,
					String.class);
			return response.getBody();
		}

		private String getBabyPersonalBaseUrl() {
			InstanceInfo instanceInfo = client.getNextServerFromEureka("personal-service", false);
			String baseUrl = instanceInfo.getHomePageUrl();
			return baseUrl;
		}

	

}

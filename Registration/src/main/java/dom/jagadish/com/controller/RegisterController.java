package dom.jagadish.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import dom.jagadish.com.model.Registration;
import dom.jagadish.com.service.RegisterService;

@RestController
@CrossOrigin("http://localhost:4200")
//@RequestMapping("rest")
public class RegisterController {

	@Autowired
	RegisterService registerService;

	@RequestMapping(method = RequestMethod.POST, value = "/regRepository")
	public void addUser(@RequestBody Registration reg) {
		registerService.addUser(reg);

	}

	/*
	 * @RequestMapping(value = "/show", method = RequestMethod.GET) public
	 * List<Registration> getUser() { Registration reg =new Registration();
	 * 
	 * Link selfLink = ControllerLinkBuilder .linkTo(ControllerLinkBuilder
	 * .methodOn(RegisterController.class).getUser()) .withSelfRel();
	 * 
	 * reg.add(selfLink);
	 * 
	 * 
	 * return registerService.getAllUsers();
	 * 
	 * }
	 */
	/*
	 * @RequestMapping("/") public HttpEntity<Registration> getRes() { Registration
	 * reg =new Registration(); String baseUri =
	 * BasicLinkBuilder.linkToCurrentMapping().toString();
	 * 
	 * Link selfLink = ControllerLinkBuilder .linkTo(ControllerLinkBuilder
	 * .methodOn(RegisterService.class).getAllUsers()) .withSelfRel();
	 * reg.add(selfLink);
	 * 
	 * 
	 * Link catalogServiceLink = new Link(new UriTemplate(baseUri + "/shows"),
	 * Registration.LINK_NAME_CATALOG); reg.add(catalogServiceLink); return new
	 * ResponseEntity<>(reg, HttpStatus.OK); }
	 */
}
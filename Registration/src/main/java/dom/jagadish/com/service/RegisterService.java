package dom.jagadish.com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dom.jagadish.com.model.Registration;
import dom.jagadish.com.repository.RegisterRepository;

@Service
public class RegisterService {

	@Autowired
	RegisterRepository regRepository;

	Registration registration;

	public RegisterRepository getRegRepository() {
		return regRepository;
	}

	public void setRegRepository(RegisterRepository regRepository) {
		this.regRepository = regRepository;
	}

	public Registration addUser(Registration register) {
		String status = emailValidate(register);
		String status1 = userValidate(register);

		if (status.equals("notreg") && status1.equals("notuserid")) {
			regRepository.save(register);
		} else if (status.equals("reg")) {
			System.out.println("email already exits");
		} else if (status1.equals("userid")) {
			System.out.println("userid already exits");
		}
		return register;
	}

	public String emailValidate(Registration register) {
		List<Registration> reges = regRepository.findAll();
		for (Registration list : reges) {

			if (register.getEmailId().equals(list.getEmailId())) {
				return "reg";
			}
		}
		return "notreg";
	}

	public String userValidate(Registration register) {
		List<Registration> reges = regRepository.findAll();
		for (Registration list1 : reges) {

			if (register.getUserId().equals(list1.getUserId())) {
				return "userid";
			}
		}
		return "notuserid";
	}
	/*
	 * public List<Registration> getAllUsers() {
	 * 
	 * List<Registration> users = new ArrayList<>();
	 * regRepository.findAll().forEach(users::add);
	 * 
	 * return users;
	 * 
	 * }
	 */
}
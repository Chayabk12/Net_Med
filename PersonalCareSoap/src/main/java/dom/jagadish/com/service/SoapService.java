package dom.jagadish.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.Soap;
import dom.jagadish.com.repository.SoapRepository;

@Service
public class SoapService {

	@Autowired
	private SoapRepository soapRepository;

	public SoapRepository getBodyRepository() {
		return soapRepository;
	}

	public void setBodyRepository(SoapRepository soapRepository) {
		this.soapRepository = soapRepository;
	}

	public Soap saveSoapProduct(Soap personalCare) {

		return soapRepository.save(personalCare);
	}

	public List<Soap> getSoapProductDetails() {

		return soapRepository.findAll();
	}

	public Optional<Soap> getSoapProduct(String id) {
		List<Soap> body = soapRepository.findAll();
		for (Soap list : body) {
			if (id.equals(list.getProductId())) {
				return soapRepository.findById(id);
			}
		}

		return null;
	}

	public boolean updateSoapProduct(Soap soap, String id) {

		List<Soap> soaps = soapRepository.findAll();

		for (Soap Obj : soaps) {
			if (Obj.getProductId().equals(id)) {
				soapRepository.save(soap);

				return true;
			}
		}
		return false;
	}

	public String deleteSoapProduct(String id) {
		List<Soap> soaps = soapRepository.findAll();

		for (Soap body : soaps) {

			if (body.getProductId().equals(id)) {
				soapRepository.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}

	public String deleteAllSoapProducts() {
		List<Soap> body = soapRepository.findAll();
		if (body.size() >= 1) {
			soapRepository.deleteAll();
			return "All products deleted successfully";
		} else
			return "Unable to delete all products";
	}

}

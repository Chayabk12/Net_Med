package dom.jagadish.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.BodyLotion;
import dom.jagadish.com.repository.BodyRepository;

@Service
public class BodyService {

	@Autowired
	private BodyRepository bodyRepository;

	public BodyRepository getBodyRepository() {
		return bodyRepository;
	}

	public void setBodyRepository(BodyRepository bodyRepository) {
		this.bodyRepository = bodyRepository;
	}

	public BodyLotion saveBodyProduct(BodyLotion personalCare) {

		return bodyRepository.save(personalCare);
	}

	public List<BodyLotion> getBodyProductDetails() {

		return bodyRepository.findAll();
	}

	public Optional<BodyLotion> getBodyProductDetail(String id) {
		List<BodyLotion> body = bodyRepository.findAll();
		for (BodyLotion list : body) {
			if (id.equals(list.getProductId())) {
				return bodyRepository.findById(id);
			}
		}

		return null;
	}

	public boolean updateBodyProduct(BodyLotion bodyLotion, String id) {

		List<BodyLotion> bodyLotions = bodyRepository.findAll();

		for (BodyLotion Obj : bodyLotions) {
			if (Obj.getProductId().equals(id)) {
				bodyRepository.save(bodyLotion);

				return true;
			}
		}
		return false;
	}

	public String deleteBodyProduct(String id) {
		List<BodyLotion> bodylotions = bodyRepository.findAll();

		for (BodyLotion body : bodylotions) {

			if (body.getProductId().equals(id)) {
				bodyRepository.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}

	public String deleteAllBodyProducts() {
		List<BodyLotion> body = bodyRepository.findAll();
		if (body.size() >= 1) {
			bodyRepository.deleteAll();
			return "All products deleted successfully";
		} else
			return "Unable to delete all products";
	}
}

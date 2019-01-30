package dom.jagadish.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.HairCare;

import dom.jagadish.com.repository.HairRepository;

@Service
public class HairService {

	@Autowired
	private HairRepository hairRepository;

	public HairRepository getHairRepository() {
		return hairRepository;
	}

	public void setHairRepository(HairRepository hairRepository) {
		this.hairRepository = hairRepository;
	}

	public HairCare saveHairProduct(HairCare personalCare) {

		return hairRepository.save(personalCare);
	}

	public List<HairCare> getFaceProductDetails() {

		return hairRepository.findAll();
	}

	public Optional<HairCare> getHairProduct(String id) {
		List<HairCare> body = hairRepository.findAll();
		for (HairCare list : body) {
			if (id.equals(list.getProductId())) {
				return hairRepository.findById(id);
			}
		}

		return null;
	}

	public boolean updateHairProduct(HairCare hairCare, String id) {

		List<HairCare> hair = hairRepository.findAll();

		for (HairCare Obj : hair) {
			if (Obj.getProductId().equals(id)) {
				hairRepository.save(hairCare);

				return true;
			}
		}
		return false;
	}

	public String deleteHairProduct(String id) {
		List<HairCare> soaps = hairRepository.findAll();

		for (HairCare body : soaps) {

			if (body.getProductId().equals(id)) {
				hairRepository.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}

	public String deleteAllHairProducts() {
		List<HairCare> body = hairRepository.findAll();
		if (body.size() >= 1) {
			hairRepository.deleteAll();
			return "All products deleted successfully";
		} else
			return "Unable to delete all products";
	}

}

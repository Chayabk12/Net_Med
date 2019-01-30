package dom.jagadish.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dom.jagadish.com.model.FaceCreams;

import dom.jagadish.com.repository.FaceRepository;

@Service
public class FaceService {

	@Autowired
	private FaceRepository faceRepository;

	public FaceRepository getFaceRepository() {
		return faceRepository;
	}

	public void setFaceRepository(FaceRepository faceRepository) {
		this.faceRepository = faceRepository;
	}

	public FaceCreams saveFaceProduct(FaceCreams face) {

		return faceRepository.save(face);
	}

	public List<FaceCreams> getFaceProductDetails() {

		return faceRepository.findAll();
	}

	public Optional<FaceCreams> getFaceCreamProduct(String id) {
		List<FaceCreams> body = faceRepository.findAll();
		for (FaceCreams list : body) {
			if (id.equals(list.getProductId())) {
				return faceRepository.findById(id);
			}
		}

		return null;
	}

	public boolean updateFaceProduct(FaceCreams faceCream, String id) {

		List<FaceCreams> face = faceRepository.findAll();

		for (FaceCreams Obj : face) {
			if (Obj.getProductId().equals(id)) {
				faceRepository.save(faceCream);

				return true;
			}
		}
		return false;
	}

	public String deleteFaceProduct(String id) {
		List<FaceCreams> soaps = faceRepository.findAll();

		for (FaceCreams body : soaps) {

			if (body.getProductId().equals(id)) {
				faceRepository.deleteById(id);
				return "product deleted";
			}

		}
		return " unable to delete product with id " + id;

	}

	public String deleteAllFaceProducts() {
		List<FaceCreams> body = faceRepository.findAll();
		if (body.size() >= 1) {
			faceRepository.deleteAll();
			return "All products deleted successfully";
		} else
			return "Unable to delete all products";
	}

}

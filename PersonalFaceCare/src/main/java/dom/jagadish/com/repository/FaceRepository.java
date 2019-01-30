package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.FaceCreams;

public interface FaceRepository extends MongoRepository<FaceCreams, String> {
	
	
}


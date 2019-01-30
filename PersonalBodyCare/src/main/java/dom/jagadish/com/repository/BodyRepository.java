package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.BodyLotion;


public interface BodyRepository extends MongoRepository<BodyLotion, String> {

}


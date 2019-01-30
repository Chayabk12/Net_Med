package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.HairCare;


public interface HairRepository extends MongoRepository<HairCare, String> {

	

}

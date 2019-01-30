package dom.jagadish.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import dom.jagadish.com.model.Soap;

public interface SoapRepository extends MongoRepository<Soap, String> {

}

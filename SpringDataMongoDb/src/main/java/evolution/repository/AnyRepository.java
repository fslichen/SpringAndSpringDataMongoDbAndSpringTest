package evolution.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import evolution.entity.AnyEntity;

// Put some commonly called methods inside repository class, and mongoTemplate can take care of the rest.
public interface AnyRepository extends MongoRepository<AnyEntity, String> {
	@Query(value = "{'name':?0}")// 0 represents the first parameter.
	public List<AnyEntity> findByName(String name);
	
	public List<AnyEntity> findByGender(String gender);
}

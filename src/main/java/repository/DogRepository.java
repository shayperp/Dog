package repository;

import model.Dog;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DogRepository extends MongoRepository<Dog, Integer> {
}
package io.details.Repository;

import io.details.Entity.Readings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ReadingsRepository extends CrudRepository<Readings, String> {

}

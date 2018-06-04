package io.details.Repository;


import io.details.Entity.Tires;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TiresRepository extends CrudRepository<Tires, String>{

}

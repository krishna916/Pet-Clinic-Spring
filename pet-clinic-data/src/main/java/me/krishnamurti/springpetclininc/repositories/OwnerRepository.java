/**
 * 
 */
package me.krishnamurti.springpetclininc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springpetclininc.model.Owner;

/**
 * @author krishna
 *
 */
@Repository
public interface OwnerRepository extends CrudRepository<Owner, Long>{
	
	Owner findByLastName(String lastName);
	
}

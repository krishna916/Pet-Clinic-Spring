/**
 * 
 */
package me.krishnamurti.springpetclininc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springpetclininc.model.PetType;

/**
 * @author krishna
 *
 */
@Repository
public interface PetTypeRepository extends CrudRepository<PetType, Long>{

}

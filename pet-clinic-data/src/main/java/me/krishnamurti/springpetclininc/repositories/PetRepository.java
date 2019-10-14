/**
 * 
 */
package me.krishnamurti.springpetclininc.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import me.krishnamurti.springpetclininc.model.Pet;

/**
 * @author krishna
 *
 */
@Repository
public interface PetRepository  extends CrudRepository<Pet, Long>{

}

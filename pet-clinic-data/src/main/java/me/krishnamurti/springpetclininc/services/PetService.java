/**
 * 
 */
package me.krishnamurti.springpetclininc.services;


import java.util.Set;


import me.krishnamurti.springpetclininc.model.Pet;

/**
 * @author krishna
 *
 */

public interface PetService extends CrudService<Pet, Long>{

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();
}

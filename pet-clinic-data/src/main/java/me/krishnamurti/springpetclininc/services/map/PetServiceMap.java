/**
 * 
 */
package me.krishnamurti.springpetclininc.services.map;

import java.util.Set;

import me.krishnamurti.springpetclininc.model.Pet;
import me.krishnamurti.springpetclininc.services.CrudService;

/**
 * @author krishna
 *
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	
	@Override
	public void delete(Pet object) {
		super.delete(object);;
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
	
}

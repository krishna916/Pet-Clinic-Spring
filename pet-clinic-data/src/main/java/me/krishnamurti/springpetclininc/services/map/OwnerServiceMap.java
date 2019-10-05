/**
 * 
 */
package me.krishnamurti.springpetclininc.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import me.krishnamurti.springpetclininc.model.Owner;
import me.krishnamurti.springpetclininc.services.OwnerService;

/**
 * @author krishna
 *
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		return super.save(object.getId(), object);
	}
	
	@Override
	public void delete(Owner owner) {
		super.delete(owner);;
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

}

/**
 * 
 */
package me.krishnamurti.springpetclininc.services.map;

import java.util.Set;

import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.services.VetService;

/**
 * @author krishna
 *
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	
	@Override
	public void delete(Vet object) {
		super.delete(object);;
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}

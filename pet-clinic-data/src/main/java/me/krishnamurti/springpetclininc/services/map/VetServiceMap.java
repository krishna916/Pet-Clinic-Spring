/**
 * 
 */
package me.krishnamurti.springpetclininc.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import me.krishnamurti.springpetclininc.model.Vet;
import me.krishnamurti.springpetclininc.services.VetService;

/**
 * @author krishna
 *
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Vet save(Vet object) {
		return super.save(object);
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
